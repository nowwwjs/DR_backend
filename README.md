Spring Boot 프로젝트 맛있는재활용
=

> 작업기간: 2024.09.27 ~ 2023.11.15 <br>
> 참여 인원 : 5명 <br> <br>
> 음식물 쓰레기 감소를 위한 챗봇 레시피 추천 웹서비스 입니다 <br>

![메인 페이지](https://github.com/user-attachments/assets/d48cbb34-572c-4d88-856d-2941d4dbb4c7)

## 📚목차
- [들어가며](#-들어가며)
  - [프로젝트 소개](#1️⃣-프로젝트-소개)    
  - [프로젝트 기능](#2️⃣-프로젝트-기능)    
  - [사용 기술](#3️⃣-사용-기술)   
     - [백엔드](#3-1-백엔드)
     - [프론트엔드](#3-2-프론트엔드)
  - [실행 화면](#4️⃣-실행-화면)   

- [구조 및 설계](#구조-및-설계)
  - [패키지 구조](#5️⃣-패키지-구조)
  - [DB 설계](#6️⃣-db-설계)
  - [API 설계](#7️⃣-api-설계)

- [개발 내용](#개발-내용)

- [마치며](#마치며)
  - [프로젝트 보완사항](#8️⃣-프로젝트-보완사항)
  - [후기](#9️⃣-후기)

## 💬들어가며
### 1️⃣ 프로젝트 소개

국비지원 수업의 마지막 과정으로 팀 프로젝트를 진행하게 되었습니다. <br>
서비스 이용을 진행 할수록 누적되는 적절한 보상과 출석체크 시스템 및 공공데이터를 활용하여 <br>
유저들의 환경보호 참여의지를 고취시키는 챗봇 서비스 입니다

### 2️⃣ 프로젝트 기능

제가 구현한 프로젝트의 주요 기능은 다음과 같습니다.

- **관리자 -** 삭제 기능 , 검색 기능 , 파일 등록 , 파일 삭제 , 상세페이지 연결
- **레시피 -** 찜 기능 , 추천 기능 , 신고 기능
- **게시판 -** toast api 이용한 글등록


### 3️⃣ 사용 기술

#### 3-1 백엔드

##### 주요 프레임워크 / 라이브러리
- Java 17
- SpringBoot 3.2.10
- MyBatis
- Spring Security
- OAuth 2.0

##### Build Tool
- Gradle 7.2

##### DataBase
- Oracle 11.2.0.2.0

#### 3-2 프론트엔드
- Html/Css
- JavaScript
- Jquery
- ThymeLeaf

### 4️⃣ 실행 화면
 <details>
    <summary>관리자 관련</summary>
     
  **1. 관리자 대시보드**<br>
  ![대시보드](https://github.com/user-attachments/assets/5c5f987d-1bca-4a49-85f0-1fce051ad778)<br>
  로그인한 관리자의 이름이 왼쪽 상단에 뜨고 , 회원 수 , 신고 수 , 오늘 날짜 , 권리자 신원정보를 제공한다.
  
  <br><br><br>
       
  **2. 회원 관리**<br>
  ![회원관리-1](https://github.com/user-attachments/assets/9cd79e20-15f9-4651-b7cd-0aa352ee7bf3)<br>
  회원의 기본 정보와 현재 상태를 보여준다.<br><br>

  ![회원관리-3](https://github.com/user-attachments/assets/c7834b8e-98bf-4fe1-8df8-1b781de204b5)<br>
 닉네임 4번 회원이 7일 정지된 모습<br><br>

 ![회원관리-4](https://github.com/user-attachments/assets/8f87fafb-9190-4636-8091-9e3ef5bcc317)<br>
 닉네임 2번 회원이 탈퇴된 모습<br><br> 

![회원관리-2](https://github.com/user-attachments/assets/64484cea-16d6-432f-b383-af32845a5a59)<br>
 닉네임 12번 회원을 검색한 모습
 
<br><br><br>

  **3. 게시글 관리** <br>
  ![게시글 관리-1](https://github.com/user-attachments/assets/d1e5e9b2-7a5d-4244-b5f1-80fe8ff8e389)<br>
  제목 , 작성자 , 추천수 , 작성일 , 게시글 종류를 보여준다.<br><br>

  ![게시글 관리-2](https://github.com/user-attachments/assets/d475df98-f18d-4cb4-b2b4-183e5171af0e)<br>
  30번 게시글의 모습<br><br>

 ![게시글 관리-3](https://github.com/user-attachments/assets/a5381bd8-0bc2-4922-a860-ede5701b964f)<br>
  10번 게시글 삭제된 모습

  <br><br><br>

  **4.레시피 관리** <br> 
  ![레시피 관리-1](https://github.com/user-attachments/assets/73938b57-00f6-40ce-b43d-605397bcfae9)<br>
  제목 , 작성자 , 추천수 , 작성일 , 레시피 종류를 보여준다.<br><br>

 ![레시피 관리-2](https://github.com/user-attachments/assets/40fff5d6-47bb-4bf7-a23a-238f68ff0f7e)<br>
  190번 게시글의 모습<br><br>

 ![레시피 관리-3](https://github.com/user-attachments/assets/8f2a2c6e-f67c-4e06-b9e6-9aceb2db63b7)<br>
  103번 게시글 삭제된 모습

  <br><br><br>

  **5.댓글 관리** <br>
 ![댓글 관리-1](https://github.com/user-attachments/assets/a300f3ef-a05a-436e-a63e-cc765f6fef12)<br>
  댓글내 , 작성자 ,전화번호 , 작성일을 보여준다.<br><br>

 ![댓글 관리-2](https://github.com/user-attachments/assets/87239637-efc0-4cd5-acdb-714d2bdb8663)<br>
  540번 글의 모습<br><br>

![댓글 관리-3](https://github.com/user-attachments/assets/76bdf724-70a9-4f3a-8f51-af924c5f66fc)<br>
  546번 댓글 삭제된 모습

  <br><br><br>

   **6.포인트 관리** <br>
 ![포인트 관리-1](https://github.com/user-attachments/assets/edfad7f8-68e1-42ea-bf80-e19ede9ab886)<br>
 닉네임 , 이메일 , 포인트 내용 , 포인트 , 일시 , 포인트 합을 보여준다.<br><br>
 
![포인트 관리-2](https://github.com/user-attachments/assets/55e47c05-a8e7-4e8c-894b-7201d6fbb876)<br>
11월에 해당하는 포인트만 보여진다.<br><br>

![포인트 관리-3](https://github.com/user-attachments/assets/869eea5e-b592-4ebb-a5c1-bdf46a8c6aa6)<br>
닉네임 10을 검색한 모습  , 포인트내역을 쭉 부여준다.<br><br>

![포인트 관리-4](https://github.com/user-attachments/assets/0e7aea38-8419-431a-a733-d118b7c8a37e)<br>
50포인트를 회수 했을때의 모습 , 총 포인트 감소<br><br>

![포인트 관리05](https://github.com/user-attachments/assets/00dbf392-a028-4fc1-aae3-325d104f004d)<br>
3번 닉네임의 포인트가 사라진 모습

<br><br><br>

 **7.신고 관리** <br>
 ![신고관리-1](https://github.com/user-attachments/assets/e31bfa34-afd6-4d3f-ab0e-aa9969277d83)<br>
 게시글 , 댓글 포함한 신고내역이 보여진다. (신고 내역의 번호를 보고 게시글과 , 댓글 관리로 가서 삭제하는 원리)<br><br>

 ![신고관리-2](https://github.com/user-attachments/assets/da1bca4b-dde3-45c4-a88c-ae8baeb7569b)<br>
  49번 번호 삭제

  <br><br><br>

   **8.상품 관리** <br>
   
![상품관리-3](https://github.com/user-attachments/assets/cd4feb1d-b394-4a20-884c-c1b66ca4c5b1)<br>
 상품이름 , 사진 , 가격 , 코드를 입력하고 등록하는 모습<br><br>
 
![상품관리-1](https://github.com/user-attachments/assets/2dadfc4f-fc59-4046-a7aa-ba811a38d1c8)<br>
  현재 등록된 상품을 보여준다.<br><br> 

   ![상품관리-2](https://github.com/user-attachments/assets/e6ab9b98-d660-4946-a28d-a14282acfe22)<br>
  팬케이크가 삭제된 모습<br><br> 

   ![상품관리-4](https://github.com/user-attachments/assets/04d9920e-3d2f-44dd-a0c7-edfedf257693)<br>
   상품 추가를 위해 코드를 더 입력하는 모습<br><br>

   ![상품관리-5](https://github.com/user-attachments/assets/ddac0c86-6bfc-4a69-9c1d-151ffb4adc7b)<br>
 추가된 상품의 개수를 보여준다.

  
  <br><br><br>
    
  </details>

  <br>
  
## 구조 및 설계   
   
### 5️⃣ 패키지 구조
   
<details>
  
<summary>패키지 구조 보기 (Click)</summary>   
 

```
📦src
 ┣ 📂main
 ┃ ┣ 📂java
 ┃ ┃ ┗ 📂com.dr
 ┃ ┃ ┃ ┗ 📂api
 ┃ ┃ ┃ ┃ ┗ 📜MyPageApi.java
 ┃ ┃ ┃ ┣ 📂config
 ┃ ┃ ┃ ┃ ┗ 📜SecurityConfig.java
 ┃ ┃ ┃ ┣ 📂controller
 ┃ ┃ ┃ ┃ ┣ 📂board
 ┃ ┃ ┃ ┃ ┃ ┗ 📜BoardController.java
 ┃ ┃ ┃ ┃ ┣ 📂chatBot.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ChatBotController.java
 ┃ ┃ ┃ ┃ ┃ ┗ 📜NangjangbotController.java
 ┃ ┃ ┃ ┃ ┣ 📂error
 ┃ ┃ ┃ ┃ ┃ ┗ 📜ErrorContorller.java(아직미구현)
 ┃ ┃ ┃ ┃ ┣ 📂main
 ┃ ┃ ┃ ┃ ┃ ┣ 📜MainController.java
 ┃ ┃ ┃ ┃ ┃ ┗ 📜PublicDataApiController.java
 ┃ ┃ ┃ ┃ ┣ 📂manager
 ┃ ┃ ┃ ┃ ┃ ┗ 📜ManagerController.java
 ┃ ┃ ┃ ┃ ┣ 📂myPage
 ┃ ┃ ┃ ┃ ┃ ┗ 📜MyPageController.java
 ┃ ┃ ┃ ┃ ┣ 📂rnak
 ┃ ┃ ┃ ┃ ┃ ┗ 📜RankController.java
 ┃ ┃ ┃ ┃ ┣ 📂recipe
 ┃ ┃ ┃ ┃ ┃ ┣ 📜FileApiController.java
 ┃ ┃ ┃ ┃ ┃ ┗ 📜RecipeController.java
 ┃ ┃ ┃ ┃ ┣ 📂shop
 ┃ ┃ ┃ ┃ ┃ ┗ 📜PointShopController.java
 ┃ ┃ ┃ ┃ ┣ 📂user
 ┃ ┃ ┃ ┃ ┃ ┣ 📜SmsController.java
 ┃ ┃ ┃ ┃ ┃ ┗ 📜UserController.java
 ┃ ┃ ┃ ┣ 📂domain
 ┃ ┃ ┃ ┃ ┣ 📜CustomOAuth2User.java
 ┃ ┃ ┃ ┣ 📂dto
 ┃ ┃ ┃ ┃ ┣ 📂board
 ┃ ┃ ┃ ┃ ┃ ┣ 📜BoardReportDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜BoardScoreDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜FreeBoardCommentDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜FreeBoardDetailDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜FreeBoardListDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜FreeBoardWriteDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜FreeGoodDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜HoneyBoardCommentDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜HoneyBoardDetailDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜HoneyBoardListDTO.java
 ┃ ┃ ┃ ┃ ┃ ┗ 📜HoneyGoodDTO.java
 ┃ ┃ ┃ ┃ ┣ 📂chatBot
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ChatRequest.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ChatResponse.java
 ┃ ┃ ┃ ┃ ┃ ┗ 📜NangjangbotDTO.java
 ┃ ┃ ┃ ┃ ┣ 📂main
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ApiDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ItemDTO.java
 ┃ ┃ ┃ ┃ ┃ ┗ 📜SearchDTO.java
 ┃ ┃ ┃ ┃ ┣ 📂manager
 ┃ ┃ ┃ ┃ ┃ ┣ 📜DashBoardDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ManagerBoardDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ManagerCommentDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ManagerDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ManagerLoginDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ManagerPhotoDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ManagerPointDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ManagerProductDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ManagerRecipeDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ManagerRegisterDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ManagerReportDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ManagerSessionDTO.java
 ┃ ┃ ┃ ┃ ┃ ┗ 📜ManagerUserDTO.java
 ┃ ┃ ┃ ┃ ┣ 📂myPage
 ┃ ┃ ┃ ┃ ┃ ┣ 📜CheckDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜PointCheckDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜PointDetailDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜PointRecordDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜SirenListDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜UserCheckDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜UserInfoDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜UserPosttDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜UserRecipeDTO.java
 ┃ ┃ ┃ ┃ ┃ ┗ 📜UserSteamDTO.java
 ┃ ┃ ┃ ┃ ┣ 📂rank
 ┃ ┃ ┃ ┃ ┃ ┗ 📜RankDTO.java
 ┃ ┃ ┃ ┃ ┣ 📂recipe
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ChatBotRecipeCommentDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ChatBotRecipeDetailDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ChatBotRecipeGoodDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ChatBotRecipeListDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ChatBotRecipeWriteCommentDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ChatBotRecipeWriteDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜MyRecipeCommentDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ManagerProductDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜MyRecipeDetailDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜MyRecipeGoodDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜MyRecipeListDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜MyRecipeWriteDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜RecipePhotoDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜RecipeReportDTO.java
 ┃ ┃ ┃ ┃ ┃ ┗ 📜RecipeSteamDTO.java
 ┃ ┃ ┃ ┃ ┣ 📂shop
 ┃ ┃ ┃ ┃ ┃ ┗ 📜PointShopDTO.java
 ┃ ┃ ┃ ┃ ┣ 📂user
 ┃ ┃ ┃ ┃ ┃ ┣ 📜EmailFindDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜KakaoUsersDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜PwFindDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜PwResetDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜UserDTO.java
 ┃ ┃ ┃ ┃ ┃ ┗ 📜UserSessionDTO.java
 ┃ ┃ ┃ ┣ 📂mapper
 ┃ ┃ ┃ ┃ ┣ 📂board
 ┃ ┃ ┃ ┃ ┃ ┗ 📜BoardMapper.java
 ┃ ┃ ┃ ┃ ┣ 📂chatBot
 ┃ ┃ ┃ ┃ ┃ ┗ 📜NangjangbotMapper.java
 ┃ ┃ ┃ ┃ ┣ 📂main
 ┃ ┃ ┃ ┃ ┃ ┗ 📜SearchMapper.java
 ┃ ┃ ┃ ┃ ┣ 📂manager
 ┃ ┃ ┃ ┃ ┃ ┗ 📜ManagerMapper.java
 ┃ ┃ ┃ ┃ ┣ 📂myPage
 ┃ ┃ ┃ ┃ ┃ ┗ 📜MyPageMapper.java
 ┃ ┃ ┃ ┃ ┣ 📂rank
 ┃ ┃ ┃ ┃ ┃ ┗ 📜RecipeMapper.java
 ┃ ┃ ┃ ┃ ┣ 📂shop
 ┃ ┃ ┃ ┃ ┃ ┗ 📜PointShopMapper.java
 ┃ ┃ ┃ ┃ ┣ 📂user
 ┃ ┃ ┃ ┃ ┃ ┣ 📜KakaoUsers.java
 ┃ ┃ ┃ ┃ ┃ ┗ 📜UserMapper.java
 ┃ ┃ ┃ ┣ 📂mybatis
 ┃ ┃ ┃ ┃ ┗ 📜MyBatisConfig.java
 ┃ ┃ ┃ ┣ 📂service
 ┃ ┃ ┃ ┃ ┣ 📂board
 ┃ ┃ ┃ ┃ ┃ ┗ 📜BoardService.java
 ┃ ┃ ┃ ┃ ┣ 📂chatBot
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ChatBotService.java
 ┃ ┃ ┃ ┃ ┃ ┗ 📜NangjangbotService.java
 ┃ ┃ ┃ ┃ ┣ 📂main
 ┃ ┃ ┃ ┃ ┃ ┣ 📜PublicDataService.java
 ┃ ┃ ┃ ┃ ┃ ┗ 📜SearchService.java
 ┃ ┃ ┃ ┃ ┣ 📂manager
 ┃ ┃ ┃ ┃ ┃ ┗ 📜ManagerService.java
 ┃ ┃ ┃ ┃ ┣ 📂myPage
 ┃ ┃ ┃ ┃ ┃ ┗ 📜MyPageService.java
 ┃ ┃ ┃ ┃ ┣ 📂rank
 ┃ ┃ ┃ ┃ ┃ ┗ 📜RankService.java
 ┃ ┃ ┃ ┃ ┣ 📂recipe
 ┃ ┃ ┃ ┃ ┃ ┗ 📜RecipeService.java
 ┃ ┃ ┃ ┃ ┣ 📂shop
 ┃ ┃ ┃ ┃ ┃ ┗ 📜PointShopService.java
 ┃ ┃ ┃ ┃ ┣ 📂user
 ┃ ┃ ┃ ┃ ┃ ┣ 📜CoolSmsService.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜CustomOAuth2UserService.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜RandomStringGeneratorService.java
 ┃ ┃ ┃ ┃ ┃ ┗ 📜UserService.java
 ┃ ┃ ┃ ┗ 📜DrApplication.java
 ┃ ┣ 📂resources
 ┃ ┃ ┣ 📂config
 ┃ ┃ ┃ ┗ 📜config.xml
 ┃ ┃ ┣ 📂mapper
 ┃ ┃ ┃ ┣ 📂board
 ┃ ┃ ┃ ┃ ┗📜BoardMapper.xml
 ┃ ┃ ┃ ┣ 📂chatBot
 ┃ ┃ ┃ ┃ ┗📜NangjangbotMapper.xml
 ┃ ┃ ┃ ┣ 📂main
 ┃ ┃ ┃ ┃ ┗📜SearchMapper.xml
 ┃ ┃ ┃ ┣ 📂manager
 ┃ ┃ ┃ ┃ ┗📜ManagerMapper.xml
 ┃ ┃ ┃ ┣ 📂myPage
 ┃ ┃ ┃ ┃ ┗📜MyPageMapper.xml
 ┃ ┃ ┃ ┣ 📂rank
 ┃ ┃ ┃ ┃ ┗📜RankMapper.xml
 ┃ ┃ ┃ ┣ 📂recipe
 ┃ ┃ ┃ ┃ ┗📜RecipeMapper.xml
 ┃ ┃ ┃ ┣ 📂shop
 ┃ ┃ ┃ ┃ ┗📜PointShopMapper.xml
 ┃ ┃ ┃ ┣ 📂user
 ┃ ┃ ┃ ┃ ┣📜KakaoUsersMapper.xml
 ┃ ┃ ┃ ┃ ┗📜UserMapper.xml
 ┃ ┃ ┣ 📂static
 ┃ ┃ ┃ ┣ 📂css
 ┃ ┃ ┃ ┃ ┣ 📂board
 ┃ ┃ ┃ ┃ ┃ ┣📜boardReport.css
 ┃ ┃ ┃ ┃ ┃ ┣📜freeBoardDetail.css
 ┃ ┃ ┃ ┃ ┃ ┣📜freeBoardList.css
 ┃ ┃ ┃ ┃ ┃ ┣📜freeBoardModify.css
 ┃ ┃ ┃ ┃ ┃ ┣📜freeBoardWirte.css
 ┃ ┃ ┃ ┃ ┃ ┣📜honeyBoardDetail.css
 ┃ ┃ ┃ ┃ ┃ ┣📜honeyBoardList.css
 ┃ ┃ ┃ ┃ ┃ ┣📜honeyBoardModify.css
 ┃ ┃ ┃ ┃ ┃ ┗📜honeyBoardWirte.css
 ┃ ┃ ┃ ┃ ┣ 📂chatBot
 ┃ ┃ ┃ ┃ ┃ ┗📜nangjangbot.css
 ┃ ┃ ┃ ┃ ┣ 📂fragment
 ┃ ┃ ┃ ┃ ┃ ┣📜header.css
 ┃ ┃ ┃ ┃ ┃ ┗📜footer.css
 ┃ ┃ ┃ ┃ ┣ 📂main
 ┃ ┃ ┃ ┃ ┃ ┣📜boardSearchList.css
 ┃ ┃ ┃ ┃ ┃ ┣📜main.css
 ┃ ┃ ┃ ┃ ┃ ┣📜privacyPoilcy.css
 ┃ ┃ ┃ ┃ ┃ ┣📜recipeSearchList.css
 ┃ ┃ ┃ ┃ ┃ ┗📜terms.css
 ┃ ┃ ┃ ┃ ┣ 📂manager
 ┃ ┃ ┃ ┃ ┃ ┣📜dashBoard.css
 ┃ ┃ ┃ ┃ ┃ ┣📜manageBoard.css
 ┃ ┃ ┃ ┃ ┃ ┣📜manageComment.css
 ┃ ┃ ┃ ┃ ┃ ┣📜managePoint.css
 ┃ ┃ ┃ ┃ ┃ ┣📜manageProduct.css
 ┃ ┃ ┃ ┃ ┃ ┣📜manageRecipe.css
 ┃ ┃ ┃ ┃ ┃ ┣📜manageReport.css
 ┃ ┃ ┃ ┃ ┃ ┣📜managerLogin.css
 ┃ ┃ ┃ ┃ ┃ ┣📜manageUpdate.css
 ┃ ┃ ┃ ┃ ┃ ┣📜manageUser.css
 ┃ ┃ ┃ ┃ ┃ ┗📜RegisterProduct.css
 ┃ ┃ ┃ ┃ ┣ 📂myPage
 ┃ ┃ ┃ ┃ ┃ ┣📜myPageCaution.css
 ┃ ┃ ┃ ┃ ┃ ┣📜myPageCheck.css
 ┃ ┃ ┃ ┃ ┃ ┣📜myPageDelete.css
 ┃ ┃ ┃ ┃ ┃ ┣📜myPageInformation.css
 ┃ ┃ ┃ ┃ ┃ ┣📜myPageMyComplaint.css
 ┃ ┃ ┃ ┃ ┃ ┣📜myPageMyPoint.css
 ┃ ┃ ┃ ┃ ┃ ┣📜myPageMyPost.css
 ┃ ┃ ┃ ┃ ┃ ┣📜myPageMyRecipe.css
 ┃ ┃ ┃ ┃ ┃ ┗📜myPageSteamedList.css
 ┃ ┃ ┃ ┃ ┣ 📂rank
 ┃ ┃ ┃ ┃ ┃ ┗📜userRank.css
 ┃ ┃ ┃ ┃ ┣ 📂recipe
 ┃ ┃ ┃ ┃ ┃ ┣📜chatBotDetailPage.css
 ┃ ┃ ┃ ┃ ┃ ┣📜chatBotDetailPageNone.css
 ┃ ┃ ┃ ┃ ┃ ┣📜chatBotRecipeList.css
 ┃ ┃ ┃ ┃ ┃ ┣📜chatBotRecipeModify.css
 ┃ ┃ ┃ ┃ ┃ ┣📜chatBotRecipeWriter.css
 ┃ ┃ ┃ ┃ ┃ ┣📜myDetailPage.css
 ┃ ┃ ┃ ┃ ┃ ┣📜myDetailPageNone.css
 ┃ ┃ ┃ ┃ ┃ ┣📜myRecipeList.css
 ┃ ┃ ┃ ┃ ┃ ┣📜myRecipeModify.css
 ┃ ┃ ┃ ┃ ┃ ┣📜myRecipeWriter.css
 ┃ ┃ ┃ ┃ ┃ ┗📜report.css
 ┃ ┃ ┃ ┃ ┣ 📂shop
 ┃ ┃ ┃ ┃ ┃ ┗📜pointShop.css
 ┃ ┃ ┃ ┃ ┣ 📂user
 ┃ ┃ ┃ ┃ ┃ ┣📜apiJoin.css
 ┃ ┃ ┃ ┃ ┃ ┣📜drJoin.css
 ┃ ┃ ┃ ┃ ┃ ┣📜emailFind.css
 ┃ ┃ ┃ ┃ ┃ ┣📜emailFindFinish.css
 ┃ ┃ ┃ ┃ ┃ ┣📜join.css
 ┃ ┃ ┃ ┃ ┃ ┣📜login.css
 ┃ ┃ ┃ ┃ ┃ ┣📜PwFind.css
 ┃ ┃ ┃ ┃ ┃ ┗📜PwReset.css
 ┃ ┃ ┃ ┣ 📂image
 ┃ ┃ ┃ ┃ ┣ 📂myPage
 ┃ ┃ ┃ ┃ ┃ ┗```이미지들
 ┃ ┃ ┃ ┃ ┣ 📂nangjangbot
 ┃ ┃ ┃ ┃ ┃ ┗```이미지들
 ┃ ┃ ┃ ┃ ┣ 📂photo
 ┃ ┃ ┃ ┃ ┃ ┗```이미지들
 ┃ ┃ ┃ ┃ ┣ 📂product
 ┃ ┃ ┃ ┃ ┃ ┗```이미지들
 ┃ ┃ ┃ ┃ ┣ 📂recipe
 ┃ ┃ ┃ ┃ ┃ ┗```이미지들
 ┃ ┃ ┃ ┃ ┣ 📂shop
 ┃ ┃ ┃ ┃ ┃ ┗```이미지들
 ┃ ┃ ┃ ┃ ┣ ```이미지들
 ┃ ┃ ┃ ┣ 📂js
 ┃ ┃ ┃ ┃ ┣ 📂board
 ┃ ┃ ┃ ┃ ┃ ┣📜boardReport.js
 ┃ ┃ ┃ ┃ ┃ ┣📜freeBoardDetail.js
 ┃ ┃ ┃ ┃ ┃ ┣📜freeBoardList.js
 ┃ ┃ ┃ ┃ ┃ ┣📜freeBoardModify.js
 ┃ ┃ ┃ ┃ ┃ ┣📜freeBoardWirte.js
 ┃ ┃ ┃ ┃ ┃ ┣📜honeyBoardDetail.js
 ┃ ┃ ┃ ┃ ┃ ┣📜honeyBoardList.js
 ┃ ┃ ┃ ┃ ┃ ┣📜honeyBoardModify.js
 ┃ ┃ ┃ ┃ ┃ ┗📜honeyBoardWirte.js
 ┃ ┃ ┃ ┃ ┣ 📂chatBot
 ┃ ┃ ┃ ┃ ┃ ┗📜nangjangbot.js
 ┃ ┃ ┃ ┃ ┣ 📂fragment
 ┃ ┃ ┃ ┃ ┃ ┗📜header.js
 ┃ ┃ ┃ ┃ ┣ 📂main
 ┃ ┃ ┃ ┃ ┃ ┗📜main.js
 ┃ ┃ ┃ ┃ ┣ 📂manager
 ┃ ┃ ┃ ┃ ┃ ┣📜dashBoard.js
 ┃ ┃ ┃ ┃ ┃ ┣📜manageBoard.js
 ┃ ┃ ┃ ┃ ┃ ┣📜manageComment.js
 ┃ ┃ ┃ ┃ ┃ ┣📜managePoint.js
 ┃ ┃ ┃ ┃ ┃ ┣📜manageProduct.js
 ┃ ┃ ┃ ┃ ┃ ┣📜manageRecipe.js
 ┃ ┃ ┃ ┃ ┃ ┣📜manageReport.js
 ┃ ┃ ┃ ┃ ┃ ┣📜managerLogin.js
 ┃ ┃ ┃ ┃ ┃ ┣📜manageUpdate.js
 ┃ ┃ ┃ ┃ ┃ ┣📜manageUser.js
 ┃ ┃ ┃ ┃ ┃ ┗📜RegisterProduct.js
 ┃ ┃ ┃ ┃ ┣ 📂module
 ┃ ┃ ┃ ┃ ┃ ┗📜module.js
 ┃ ┃ ┃ ┃ ┣ 📂myPage
 ┃ ┃ ┃ ┃ ┃ ┣📜myPageCaution.js
 ┃ ┃ ┃ ┃ ┃ ┣📜myPageCheck.js
 ┃ ┃ ┃ ┃ ┃ ┣📜myPageDelete.js
 ┃ ┃ ┃ ┃ ┃ ┣📜myPageInformation.js
 ┃ ┃ ┃ ┃ ┃ ┣📜myPageMyComplaint.js
 ┃ ┃ ┃ ┃ ┃ ┣📜myPageMyPoint.js
 ┃ ┃ ┃ ┃ ┃ ┣📜myPageMyPost.js
 ┃ ┃ ┃ ┃ ┃ ┣📜myPageMyRecipe.js
 ┃ ┃ ┃ ┃ ┃ ┗📜myPageSteamedList.js
 ┃ ┃ ┃ ┃ ┣ 📂rank
 ┃ ┃ ┃ ┃ ┃ ┗📜userRank.js
 ┃ ┃ ┃ ┃ ┣ 📂recipe
 ┃ ┃ ┃ ┃ ┃ ┣📜chatBotDetailPage.js
 ┃ ┃ ┃ ┃ ┃ ┣📜chatBotDetailPageNone.js
 ┃ ┃ ┃ ┃ ┃ ┣📜chatBotRecipeList.js
 ┃ ┃ ┃ ┃ ┃ ┣📜chatBotRecipeModify.js
 ┃ ┃ ┃ ┃ ┃ ┣📜chatBotRecipeWriter.js
 ┃ ┃ ┃ ┃ ┃ ┣📜myDetailPage.js
 ┃ ┃ ┃ ┃ ┃ ┣📜myDetailPageNone.js
 ┃ ┃ ┃ ┃ ┃ ┣📜myRecipeList.js
 ┃ ┃ ┃ ┃ ┃ ┣📜myRecipeModify.js
 ┃ ┃ ┃ ┃ ┃ ┣📜myRecipeWriter.js
 ┃ ┃ ┃ ┃ ┃ ┗📜report.js
 ┃ ┃ ┃ ┃ ┣ 📂shop
 ┃ ┃ ┃ ┃ ┃ ┗📜pointShop.js
 ┃ ┃ ┃ ┃ ┣ 📂user
 ┃ ┃ ┃ ┃ ┃ ┣📜apiJoin.js
 ┃ ┃ ┃ ┃ ┃ ┣📜drJoin.js
 ┃ ┃ ┃ ┃ ┃ ┣📜emailFind.js
 ┃ ┃ ┃ ┃ ┃ ┣📜emailFindFinish.js
 ┃ ┃ ┃ ┃ ┃ ┣📜join.js
 ┃ ┃ ┃ ┃ ┃ ┣📜login.js
 ┃ ┃ ┃ ┃ ┃ ┣📜PwFind.js
 ┃ ┃ ┃ ┃ ┃ ┗📜PwReset.js
 ┃ ┃ ┣ 📂templates
 ┃ ┃ ┃ ┣ 📂board
 ┃ ┃ ┃ ┃ ┣📜boardReport.html
 ┃ ┃ ┃ ┃ ┣📜freeBoardDetail.html
 ┃ ┃ ┃ ┃ ┣📜freeBoardList.html
 ┃ ┃ ┃ ┃ ┣📜freeBoardModify.html
 ┃ ┃ ┃ ┃ ┣📜freeBoardWirte.html
 ┃ ┃ ┃ ┃ ┣📜honeyBoardDetail.html
 ┃ ┃ ┃ ┃ ┣📜honeyBoardList.html
 ┃ ┃ ┃ ┃ ┣📜honeyBoardModify.html
 ┃ ┃ ┃ ┃ ┗📜honeyBoardWirte.html
 ┃ ┃ ┃ ┣ 📂chatBot
 ┃ ┃ ┃ ┃ ┗📜nangjangbot.html
 ┃ ┃ ┃ ┣ 📂error
 ┃ ┃ ┃ ┃ ┗📜미구현
 ┃ ┃ ┃ ┣ 📂fragment
 ┃ ┃ ┃ ┃ ┣📜footer.html
 ┃ ┃ ┃ ┃ ┗📜header.html
 ┃ ┃ ┃ ┣ 📂board
 ┃ ┃ ┃ ┃ ┣📜boardSearchList.html
 ┃ ┃ ┃ ┃ ┣📜privacyPolicy.html
 ┃ ┃ ┃ ┃ ┣📜recipeSearchList.html
 ┃ ┃ ┃ ┃ ┗📜terms.html
 ┃ ┃ ┃ ┣ 📂manager
 ┃ ┃ ┃ ┃ ┣📜dashBoard.html
 ┃ ┃ ┃ ┃ ┣📜manageBoard.html
 ┃ ┃ ┃ ┃ ┣📜manageComment.html
 ┃ ┃ ┃ ┃ ┣📜managePoint.html
 ┃ ┃ ┃ ┃ ┣📜manageProduct.html
 ┃ ┃ ┃ ┃ ┣📜manageRecipe.html
 ┃ ┃ ┃ ┃ ┣📜manageReport.html
 ┃ ┃ ┃ ┃ ┣📜managerLogin.html
 ┃ ┃ ┃ ┃ ┣📜manageUpdate.html
 ┃ ┃ ┃ ┃ ┣📜manageUser.html
 ┃ ┃ ┃ ┃ ┗📜registerProduct.html
 ┃ ┃ ┃ ┣ 📂rank
 ┃ ┃ ┃ ┃ ┗📜userRank.html
 ┃ ┃ ┃ ┣ 📂manager
 ┃ ┃ ┃ ┃ ┣📜chatBotDetailPage.html
 ┃ ┃ ┃ ┃ ┣📜chatBotDetailPageNone.html
 ┃ ┃ ┃ ┃ ┣📜chatBotRecipeList.html
 ┃ ┃ ┃ ┃ ┣📜chatBotRecipeModify.html
 ┃ ┃ ┃ ┃ ┣📜chatBotRecipeWirte.html
 ┃ ┃ ┃ ┃ ┣📜myDetailPage.html
 ┃ ┃ ┃ ┃ ┣📜myDetailPageNone.html
 ┃ ┃ ┃ ┃ ┣📜myRecipeList.html
 ┃ ┃ ┃ ┃ ┣📜myRecipeModify.html
 ┃ ┃ ┃ ┃ ┣📜myRecipeWirter.html
 ┃ ┃ ┃ ┃ ┗📜report.html
 ┃ ┃ ┃ ┣ 📂shop
 ┃ ┃ ┃ ┃ ┗📜pointShop.html
 ┃ ┃ ┃ ┣ 📂user
 ┃ ┃ ┃ ┃ ┣📜apiJoin.html
 ┃ ┃ ┃ ┃ ┣📜drJoin.html
 ┃ ┃ ┃ ┃ ┣📜emailFind.html
 ┃ ┃ ┃ ┃ ┣📜emailFindFinish.html
 ┃ ┃ ┃ ┃ ┣📜join.html
 ┃ ┃ ┃ ┃ ┣📜login.html
 ┃ ┃ ┃ ┃ ┣📜PwFind.html
 ┃ ┃ ┃ ┃ ┗📜PwReset.html
 ┃ ┃ ┗ 📜application.properties
 ```
  
 </details>   
 <br/>    
   
     
 ### 6️⃣ DB 설계
 
![ERD](https://github.com/user-attachments/assets/3f72fc6e-dcac-4a73-83cb-4cb9baa6a438)
※엔티티 관계도 이미지 클릭후 확대 가능합니다

![ERD_USER](https://github.com/user-attachments/assets/aeb7fd4b-5c23-49fe-ad2c-feb8958e95bd)
![ERD_MANAGER](https://github.com/user-attachments/assets/f5056cf2-90a0-46a1-9403-0676ceacc6f6)
![ERD_BOARD](https://github.com/user-attachments/assets/3164ca6d-c73e-4425-baa9-d3b5381eb5a2)
![ERD_RECIPE](https://github.com/user-attachments/assets/39fe62cc-e2fe-467f-8976-7d79509495cd)
![ERD_PRODUCT](https://github.com/user-attachments/assets/73bf54c8-f5f9-41e9-8381-0431c3a1e594)
![ERD_PHOTO](https://github.com/user-attachments/assets/5d7022fb-7f6b-4bf9-80dc-eddc92c03e94)
![ERD_SCORE](https://github.com/user-attachments/assets/c7702d30-61f7-4260-97d1-fcadf9f7277f)
![ERD_POINT](https://github.com/user-attachments/assets/a6c8b216-8d20-45e4-838c-08a7e5c567ec)
![ERD_STEAM](https://github.com/user-attachments/assets/b0bb863a-4627-4b66-a095-e6f6763141b8)
![ERD_GOOD](https://github.com/user-attachments/assets/ef3ebdd8-3d41-4d75-9cee-41758eb67caa)
![ERD_REPLY](https://github.com/user-attachments/assets/245d0748-0d98-4358-bf26-6cee077ba998)
![ERD_SIREN](https://github.com/user-attachments/assets/f30dd0eb-c5c9-47f9-b801-7db8854a91ad)
![ERD_DAILY](https://github.com/user-attachments/assets/03143311-5563-4842-92eb-cc79e245fad9)
![ERD_CHATSESSION](https://github.com/user-attachments/assets/d3648641-3890-4ba3-9ace-c93befcc083c)
![ERD_CHAT](https://github.com/user-attachments/assets/715f2092-95dc-44fa-8881-4715add9245b)

<br/>

### 7️⃣ API 설계

![API_OAuth2](https://github.com/user-attachments/assets/729064a5-819a-4238-9d69-ad32e68335b3)<br><br>
![API_main](https://github.com/user-attachments/assets/d36f32d5-fa89-4a79-bd57-dd4b398e2f72)<br><br>
![API_publicData](https://github.com/user-attachments/assets/2d283c9d-39dd-4fa1-89a1-2bf31405cbe2)<br><br>
![API_chatBot](https://github.com/user-attachments/assets/e52fb1c9-e513-4378-afa3-fb782227fd95)<br><br>
![API_pointShop](https://github.com/user-attachments/assets/0a47721b-89a9-424f-9be5-9fb464579622)<br><br>
![API_search](https://github.com/user-attachments/assets/2eefaaa5-02d8-4cab-b824-bc5080929449)<br><br>

## 개발 내용

- <a href="https://blog.naver.com/starve1304" target="_blank">맛있는 재활용 기술 블로그</a>


<br>,,,

## 마치며   
### 8️⃣ 프로젝트 보완사항   

현재 구현한 챗봇은 DB에서 채팅방 세션 테이블을 따로 관리하여 정해진 채팅방이 있지만,<br>
같은 채팅방이더라도 대화가 이어지는 느낌이 많이 떨어지는 부분에 있어서 아쉬웠습니다.<br>
api가 답변해준 내용에 대해 추가적인 대화를 이어가려 해도 그것을 기억하지 못하는 부분에 대해<br>
방법을 고민도 해 보고, api 문서도 찾아보았지만 아직까진 저의 한계로 인해 해결방법을 찾지 못하였는데<br>
이 부분에 대해 이전 대화내용을 토대로 지속적으로 이어지는 채팅이 가능하도록 꼭 보완하고 싶습니다.<br>
<br>
또한, 메인페이지에 사용된 공공데이터는 api가 월마다 갱신이 되는 형태가 아니라<br>
uddi 값을 case에 코드로 직접 추가해야하는 형태로 되어있어 매우 불편함을 느꼈습니다.<br>
대체 가능한 공공데이터를 지속적으로 찾아 자동으로 업데이트가 가능하도록 보완하고 싶습니다.<br>
<br>

<details>
  <summary>보완사항 (Click)</summary>
     
- 챗봇 api의 채팅 기억으로 추가적인 대화 지속
- 공공데이터의 자동 업데이트
  
</details>
<br>
   
   <details>
  <summary>추가할 기능 (Click)</summary>
     
- 챗봇 사이드바 페이징 처리
- 우리 서비스에 맞는 챗봇 가이드라인, 자주 묻는 질문 등 api 튜닝
  
</details>  
<br>

### 9️⃣ 후기   

팀 프로젝트의 메인이 되는 파트를 주로 맡게되어 부담감이 가장 컸고,<br>  
수업한 내용을 사용해보는 설렘도, 부족한 부분에 대한 아쉬움도 많이 남았습니다.<br> 
실제로 코드를 구현하며 그저 따라하기 급급한 부분도 조금 있었습니다.<br>
'이 로직은 이 단계에서 처리하는게 맞는가', '각 레이어간 데이터 전달은 어떤 방식이든 DTO로 하는게 맞는가' 등<br>  
여러 고민에 빠져 헤맨적도 있었지만, 우선 현재 제가 할 수 있는 최선을 찾는것에 초점을 맞춰 보았습니다.<br>
<br>
그리고 내가 만든 코드를 남에게 보여줬을 때, 누군가 코드의 근거를 물어본다면<br> 
과연 자신 있게 나의 생각을 잘 얘기할 수 있을까 라는 생각을 굉장히 많이 하게 되었습니다.<br>
그래서 하나를 구현할 때 '이렇게 구현 하는 것이 과연 최선인가', '더 나은 방법은 없을까'<br>
스스로 의심하고 고민하게 되는 습관을 가지게 되었습니다.<br>
<br>
두 번째로 기술적인 부분에서 더 공부하고 싶은 방향을 찾을 수 있었습니다.<br>  
이번 프로젝트는 저에게 좋은 경험이 되었고, 저의 부족한 부분을 스스로 알 수 있는 좋은 계기가 되었습니다.<br>
부족한 부분에 대해 스스로 인지하고 있고,<br>
자바스크립트, 스프링 흐름에 대해 더 깊게 공부하며 개발자로서 수준을 더욱 더 올리고 싶어졌습니다.<br>   
이를 통해 더 나은 웹 애플리케이션을 만들 수 있을 것 같다는 자신감도 생겼습니다.<br>
<br>
끝까지 읽어주셔서 감사합니다. 
