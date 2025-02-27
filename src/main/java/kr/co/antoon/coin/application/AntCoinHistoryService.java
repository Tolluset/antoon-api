package kr.co.antoon.coin.application;

import kr.co.antoon.coin.domain.AntCoinHistory;
import kr.co.antoon.coin.domain.vo.RemittanceStatus;
import kr.co.antoon.coin.domain.vo.RemittanceType;
import kr.co.antoon.coin.dto.CoinReason;
import kr.co.antoon.coin.infrastructure.AntCoinHistoryRepository;
import kr.co.antoon.common.util.MapperUtil;
import kr.co.antoon.common.util.TimeUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.Year;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class AntCoinHistoryService {
    private final AntCoinHistoryRepository antCoinHistoryRepository;

    @Transactional
    public void record(Long userId, Long walletId, Long amount, RemittanceStatus status, RemittanceType type, String reason, Long wallet) {
        var history = AntCoinHistory.builder()
                .userId(userId)
                .walletId(walletId)
                .amount(amount)
                .status(status)
                .type(type)
                .reason(reason)
                .wallet(wallet)
                .build();

        antCoinHistoryRepository.save(history);
    }

    @Transactional
    public boolean checkTodayJoinWebtoon(Long userId, Long webtoonId) {
        var coinReason = new CoinReason(webtoonId);

        var reason = MapperUtil.write(coinReason);

        var today = TimeUtil.now();
        today = Year.of(today.getYear())
                .atMonth(today.getMonthValue())
                .atDay(today.getDayOfMonth())
                .atTime(0, 0, 0, 0);

        return antCoinHistoryRepository.existsByRemittanceTypeAndUserIdAndReasonAndCreatedAtAfter(
                RemittanceType.JOINED_WEBTOON,
                userId,
                reason,
                today // '2022-06-19T12:31.00.9999'
        );
    }

    @Transactional
    public List<AntCoinHistory> getCoinHistory(Long userId) {
        return antCoinHistoryRepository.getAntCoinHistoryByUserId(userId);
    }

    @Transactional
    public Long countJoinWebtoon(Long userId) {
        String today = LocalDate.now().toString();
        return antCoinHistoryRepository.countTodayWebtoonReward(userId, today, "WEBTOON");
    }

    public String rewardReasonToJson(RemittanceType remittanceType, String id) {
        var jsonObject = new JSONObject();
        jsonObject.put(String.valueOf(remittanceType), id);

        return jsonObject.toString();
    }
}
