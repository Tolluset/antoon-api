package kr.co.antoon.common.dto;

public class SwaggerNote {
    public final static String DISCUSSION_CREATE_NOTE = """
                    종목토론방에 댓글 달기
                    POST /api/v1/webtoons/{webtoonId}/discussions            
                        
                    Request Body
                    {
                        "content" : "이 웹툰 꿀잼" // 댓글 내용
                    }
                        
                    Response Body
                    {
                        "webtoonId" : 1,  // 웹툰 Id
                        "discussionId" : 1, // 종목토론 댓글 Id
                        "content" :  "이 웹툰 꿀잼", // 댓글 내용
                        "userId" : 1, // 사용자 Id
                        "nickname" : "개미는 툰툰",  // 사용자 닉네임
                        "imageUrl" : "https://picture.jpg",  // 댓글 작성자 프로필 URL
                        "likeCount" : 1,  // 좋아요 카운트
                        "isUserLike": true   // 사용자 좋아요 여부
                    }            
            """;

    public final static String DISCUSSION_READ_ONE_NOTE = """
                    종목토론방에 댓글 단건 조회
                    POST /api/v1/webtoons/discussions/discussionId            
                        
                    Response Body
                    {
                        "webtoonId" : 1,  // 웹툰 Id
                        "discussionId" : 1, // 종목토론 댓글 Id
                        "content" :  "이 웹툰 꿀잼", // 댓글 내용
                        "userId" : 1, // 사용자 Id
                        "nickname" : "개미는 툰툰",  // 사용자 닉네임
                        "imageUrl" : "https://picture.jpg",  // 댓글 작성자 프로필 URL
                        "likeCount" : 1,  // 좋아요 카운트
                        "isUserLike": true   // 사용자 좋아요 여부
                    }
            """;

    public final static String DISCUSSION_READL_ALL_NOTE = """
                    종목토론방에 댓글 페이지 조회
                    GET /api/v1/webtoons/discussions
                        
                    Response Body
                    {
                        "data": [
                            {
                                "webtoonId" : 1,  // 웹툰 Id
                                "discussionId" : 1, // 종목토론 댓글 Id
                                "content" :  "이 웹툰 꿀잼", // 댓글 내용
                                "userId" : 1, // 사용자 Id
                                "nickname" : "개미는 툰툰",  // 사용자 닉네임
                                "imageUrl" : "https://picture.jpg",  // 댓글 작성자 프로필 URL
                                "likeCount" : 1,  // 좋아요 카운트
                                "isUserLike": true   // 사용자 좋아요 여부
                            }...
                        ],
                        "page": 0,
                        "size": 20,
                        "totalPages": 1,
                        "totalElements": 1,
                        "firstPage": true,
                        "lastPage": true
                    }
            """;

    public final static String DISCUSSION_UPDATE_NOTE = """
                    종목토론방에 댓글 업데이트 조회
                    PATCH /api/v1/webtoons/discussions/{discussionId}
                        
                    Response Body
                    {
                        "webtoonId" : 1,  // 웹툰 Id
                        "discussionId" : 1, // 종목토론 댓글 Id
                        "content" :  "이 웹툰 꿀잼", // 댓글 내용
                        "userId" : 1, // 사용자 Id
                        "nickname" : "개미는 툰툰",  // 사용자 닉네임
                        "imageUrl" : "https://picture.jpg",  // 댓글 작성자 프로필 URL
                        "likeCount" : 1,  // 좋아요 카운트
                        "isUserLike": true   // 사용자 좋아요 여부
                    }          
            """;

    public final static String DISCUSSION_DELETE_NOTE = """
                    종목토론방에 댓글 삭제
                    DELETE /api/v1/webtoons/discussions/{discussionId}
                        
                    Response Body
                    None
            """;

    public final static String RECOMMENDATION = """
                    웹툰 상세페이지 > 탑승/하차 API
                    status값 : JOIN, LEAVE
                    PATCH /api/v1/recommendations/{webtonId}?status={status}
                    
                    Response Body
                    {
                        "joinCount": 2,
                        "leaveCount": 1,
                        "isJoined": true,
                        "isLeaved": false
                    }
            """;

    public final static String WEBTOON_READ_DETAIL = """
                    웹툰 상세페이지 조회
                    GET /api/v1/webtoons/{webtoonId}    
                        
                    Response Body
                    {
                       "webtoondId": 1,
                       "title": "참교육",
                       "content": "무너진 교권을 지키기 위해 교권보호국 소속 나화진의 참교육이 시작된다! <부활남> 채용택 작가 X <신석기녀> 한가람 작가의 신작!",
                       "webtoonUrl": "https://comic.naver.com/webtoon/list?titleId=758037&weekday=mon",
                       "thumbnail": "https://shared-comic.pstatic.net/thumb/webtoon/758037/thumbnail/thumbnail_IMAG04_769073a7-06e5-42e2-90be-0801fa790f66.jpg", // 웹툰 썸네일
                       "platform": "NAVER",
                       "platformDescription": "네이버 웹툰",
                       "status": "PUBLISH",
                       "statusDescription": "연재",
                       "genres": [
                         {
                           "webtoonGenreId": 2,
                           "genreCategory": "ACTION",
                           "genreCategoryDescription": "액션"
                         },
                         {
                           "webtoonGenreId": 1,
                           "genreCategory": "STORY",
                           "genreCategoryDescription": "스토리"
                         }
                       ],
                       "publishDays": [
                         {
                           "webtoonPublishDayId": 1,
                           "day": "월"
                         }
                       ],
                       "writers": [
                         {
                           "webtoonWriterId": 1,
                           "name": "채용택"
                         },
                         {
                           "webtoonWriterId": 2,
                           "name": "한가람"
                         }
                       ],
                       "recommendationCountId": 7,
                       "joinCount": 0,
                       "leaveCount": 0
                     }
            """;

    public final static String DISCUSSION_LIKE_CREATE_NOTE = """
                    종목토론방 좋아요
                    PUT /api/v1/webtoons/discussions/{discussionId}/likes
                        
                    Response Body
                    None
            """;

    public final static String USER_READ_DETAIL = """
                    사용자 마이페이지 조회
                    GET /api/v1/users/mypage            
                        
                    Response Body
                    {
                        "name" : "김테스트", //사용자 이름
                        "email" : "test@naver.com", // 사용자 이메일
                        "imageUrl" : "https://image.jpg", // 프로필 이미지 url
                        "age" : 0   // 사용자 연령대 (default=0)
                    }
            """;

    public final static String WEBTOON_SEARCH = """
                    웹툰 검색 조회
                    GET /api/v1/webtoons
                        
                    Response Body
                    {
                        "data": [
                            {
                                "id": 1,
                                "title": "제목"
                            }...
                        ],    
                    }
            """;

    public static final String WEBTOON_READ_GENRE = """
                    "일상", "개그",  "판타지",  "액션", "드라마", "로맨스", "감성", "스릴러", "무협/사극", "스포츠", "옴니버스", "스토리","에피소드", "없음"
                    
                    
                    장르별 활성화된 웹툰 조회
                    GET /api/v1/webtoons/genres?genre={genre}
                        
                    Response Body
                        
                    "data": [
                      {
                        "thumbnail": "https://shared-comic.pstatic.net/thumb/webtoon/749639/thumbnail/thumbnail_IMAG04_da2eeb2c-c0ce-4433-bc82-e489df37993f.jpg",
                        "title": "남주의 첫날밤을 가져버렸다",
                        "graphScore": 649,
                        "scoreGap": 100,
                        "writers": [
                          "티바",
                          "MSG",
                          "황도톨"
                        ],
                        "platform": "NAVER",
                        "genre": "ACTION"
                      },
                      {
                        "thumbnail": "https://shared-comic.pstatic.net/thumb/webtoon/784248/thumbnail/thumbnail_IMAG04_ed49d316-2291-4ac2-be6c-1b407acbb0e8.jpg",
                        "title": "내가 키운 S급들",
                        "graphScore": 648,
                        "scoreGap": 100,
                        "writers": [
                          "seri",
                          "비완",
                          "근서"
                        ],
                        "platform": "NAVER",
                        "genre": "ACTION"
                      },
                    ],
                    "page": 0,
                    "size": 12,
                    "totalPages": 9,
                    "totalElements": 108,
                    "firstPage": true,
                    "lastPage": false
                  }
            """;

    public final static String WEBTOON_DAY_READ_NOTE = """
                    웹툰 요일별 조회
                    GET /api/v1/webtoons/days?day={day}
                        
                    Response Body
                    {
                        "data": [
                            {
                                "webtoonId" : 1,
                                "thumbnail": "https://shared-comic.pstatic.net/thumb/webtoon/783053/thumbnail/thumbnail_IMAG04_77f75c21-cdcc-4d23-bc00-1ff829d0a209.jpg",
                                "title": "김부장",
                                "writers": [
                                      "박태준 만화회사",
                                      "정종택"
                                ],
                                "day": "화"
                            },
                            {
                                "thumbnail": "https://shared-comic.pstatic.net/thumb/webtoon/703846/thumbnail/thumbnail_IMAG04_ba579f29-bb71-4003-8e07-0a0418c7b32b.jpg",
                                "title": "여신강림",
                                "writers": [
                                      "야옹이"
                                ],
                                "day": "화"
                            }, ...
                        ],
                        "page": 0,
                        "size": 12,
                        "totalPages": 1,
                        "totalElements": 1,
                        "firstPage": true,
                        "lastPage": true
                    }
            """;

    public final static String AUTH_RFRESH = """
                    토큰 재발급
                    POST /api/v1/auth/refresh
                    (헤더에 리프레시 토큰을 "Refresh"로 추가해서 api 요청해주세요!)
                        
                    Response Body
                    {
                        "accessToken": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxIiwicm9sZSI6IlVTRVIiLCJleHAiOjE2NTczMTI2MjZ9.oapnD4a2jvO4WqLprv4-1FeVpx3dWgNCDUtnrZT7-JA",
                        "refreshToken": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxIiwiZXhwIjoxNjU3MzEyNjI2fQ.iDsaEI9JN3YYEdsaUhP-EQJBhaz4llO-wNo8kpDhgGk"
                    }
            """;

    public final static String AUTH_LOGOUT = """
                    로그아웃
                    POST /api/v1/auth/logout
                    (헤더에 리프레시 토큰과 엑세스 토큰을 추가해서 api 요청해주세요!)
                    (access Token 요청 시엔 "Bearer " + accessToken 으로 추가해서 요청해주세요!
                        
                    Request Header
                    {
                        "Authorization": "Bearer " + "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxIiwicm9sZSI6IlVTRVIiLCJleHAiOjE2NTczMTI2MjZ9.oapnD4a2jvO4WqLprv4-1FeVpx3dWgNCDUtnrZT7-JA",
                        "Refresh": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxIiwiZXhwIjoxNjU3MzEyNjI2fQ.iDsaEI9JN3YYEdsaUhP-EQJBhaz4llO-wNo8kpDhgGk"
                    }     
            """;

    public final static String WEBTOON_READ_GENRES = """
                    메인페이지 장르별 웹툰 조회 
                    GET /api/v1/webtoons/genres
                       
                    Response Body
                    {
                        "webtoons": [
                            {
                                "genre": "EVERYDAY",
                                "thumbnail": "https://shared-comic.pstatic.net/thumb/webtoon/785250/thumbnail/thumbnail_IMAG04_b2a285d6-0172-44cc-bfb0-ea5eaab41f1a.jpg"
                            },
                            {
                                "genre": "EVERYDAY",
                                "thumbnail": "https://shared-comic.pstatic.net/thumb/webtoon/725586/thumbnail/thumbnail_IMAG04_147bdc44-14ef-4a49-81d0-aeec09b898be.jpg"
                            },
                            {
                                "genre": "EVERYDAY",
                                "thumbnail": "https://shared-comic.pstatic.net/thumb/webtoon/784140/thumbnail/thumbnail_IMAG04_fdda97b7-d253-4918-8f18-3c1f207c5ab3.jpg"
                            }, ...       
            """;

    public final static String USER_UPDATE_DETAIL = """
                    사용자 마이페이지 수정
                    PATCH /api/v1/users/mypage            
                        
                    Request Body
                    {
                        "name" : "김테스트", //사용자 이름
                        "imageUrl" : "https://image.jpg" // 프로필 이미지 url
                    }
            """;

    public final static String USER_IMAGE_UPDATE_DETAIL = """
                    사용자 마이페이지 프로필 이미지 수정
                    PATCH /api/v1/users/mypage/image            
                        
                    Request Body
                    {
                        "imageUrl" : "https://image.jpg" // 프로필 이미지 url
                    }
            """;

    public final static String USER_NAME_UPDATE_DETAIL = """
                    사용자 마이페이지 이름 수정
                    PATCH /api/v1/users/mypage/name            
                        
                    Request Body
                    {
                        "name" : "김테스트", //사용자 이름
                    }
            """;


    public static final String WEBTOON_READ_RANKING_NOTE = """
            현재 시간 기준으로 상승 중인 웹툰 조회
            GET /api/v1/webtoons/top-up
            
            Response Body
            {
               "webtoons": [
                 {
                   "id": 602,
                   "url": "https://page.kakao.com/home?seriesId=53190884",
                   "thumbnail": "https://dn-img-page.kakao.com/download/resource?kid=cbOcrh/hzhOeyLVuz/o3mzWEkKKAuJOLWv6bYJxK&filename=th2",
                   "title": "도굴왕",
                   "score": 650,
                   "scoreGapPercent": 0,
                   "snapshotTime": "2022-05-13T03:59:01",
                   "activeStatus": "연재",
                   "platform": "KAKAO"
                 }
               ]
             }
            """;
    public static final String GRAPH_SCORES_DAY_READ_NOTE = """
            1일 기준 그래프 조회
            GET /api/v1/webtoons/{webtoonId}/graph-scores/days
            
            Response Body            
            {
              "count": 32,
              "graphScores": [
                {
                  "graphScore": 648,
                  "scoreGap": 0,
                  "scoreGapPercent": 0,
                  "webtoonId": 1,
                  "snapshotTime": "2022-05-28T14:00:45",
                  "status": "MAINTAIN",
                  "graphStatusDescription": "유지"
                }
              ]
            }
            """;
    public static final String GRAPH_SCORES_WEEKENDS_READ_NOTE = """
            1주일 기준 그래프 조회
            GET /api/v1/webtoons/{webtoonId}/graph-scores/weekends
            
            Response Body
            {
              "count": 7,
              "graphScores": [
                {
                  "graphScore": 648,
                  "scoreGap": 0,
                  "scoreGapPercent": 0,
                  "webtoonId": 1,
                  "snapshotTime": "2022-05-29T13:00:35",
                  "status": "MAINTAIN",
                  "graphStatusDescription": "유지"
                }
              ]
            }
            """;
    public static final String GRAPH_SCORES_MONTHS_READ_NOTE = """
            1달 기준 그래프 조회
            GET /api/v1/webtoons/{webtoonId}/graph-scores/months
            
            ResponseBody
            {
              "count": 0,
              "graphScores": [
                {
                  "graphScore": 0,
                  "graphStatusDescription": "string",
                  "scoreGap": 0,
                  "scoreGapPercent": 0,
                  "snapshotTime": "2022-05-29T04:27:36.088Z",
                  "status": "DOWN",
                  "webtoonId": 0
                }
              ]
            }
            """;
    public static final String GRAPH_SCORE_THREE_MONTH_READ_NOTE = """
            3개월 기준 그래프 조회
            GET /api/v1/webtoons/{webtoonId}/graph-scores/three-months
            
            ResponseBody
            {
              "count": 0,
              "graphScores": [
                {
                  "graphScore": 0,
                  "graphStatusDescription": "string",
                  "scoreGap": 0,
                  "scoreGapPercent": 0,
                  "snapshotTime": "2022-05-29T04:28:40.611Z",
                  "status": "DOWN",
                  "webtoonId": 0
                }
              ]
            }
            """;
}