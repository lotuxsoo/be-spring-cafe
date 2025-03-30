# be-spring-cafe

## step-1 회원 가입 및 목록 조회 기능
### 구현 내용
- 회원 가입 기능
- 유저 리스트 조회 기능
- 프로필 조회 기능

### API 설계
<img width="993" alt="스크린샷 2024-04-10 오후 1 01 01" src="https://github.com/codesquad-members-2024/be-spring-cafe/assets/86272865/88b6fbce-ce20-43b5-9173-426c6779c5fc">

### 실행 화면
#### 메인 페이지
<img width="1349" alt="스크린샷 2024-04-10 오후 1 15 00" src="https://github.com/codesquad-members-2024/be-spring-cafe/assets/86272865/b93f4a7d-064b-4856-9304-f75e631e4672">

#### 회원가입 페이지
<img width="1352" alt="스크린샷 2024-04-10 오후 1 12 24" src="https://github.com/codesquad-members-2024/be-spring-cafe/assets/86272865/e7a877e7-9b56-491b-bd50-cf0f0ba1c8a7">

#### 회원 목록 페이지
- 회원가입한 사용자들의 리스트를 조회할 수 있다.
<img width="1352" alt="스크린샷 2024-04-10 오후 1 12 36" src="https://github.com/codesquad-members-2024/be-spring-cafe/assets/86272865/be4a67bb-bdf3-434c-a5e4-38cb485764cc">

#### 프로필 조회 페이지
- 사용자 id 부분을 클릭하면 프로필을 조회할 수 있다.
<img width="1348" alt="스크린샷 2024-04-10 오후 1 14 30" src="https://github.com/codesquad-members-2024/be-spring-cafe/assets/86272865/280e61af-e869-4bc4-a6b6-f6321bb4bca5">

#### 로그인 페이지
<img width="1352" alt="스크린샷 2024-04-10 오후 1 18 03" src="https://github.com/codesquad-members-2024/be-spring-cafe/assets/86272865/ce43e172-c4bc-4f64-8af5-f178fc96bc07">

## 기타
- 처음에 템플릿 엔진으로 mustache를 사용하려다가 좀 더 익숙한 thymeleaf를 사용하여 구현했습니다.

<br>

## step-2 글 쓰기 기능 구현 
### 구현 내용
- 게시글 작성 기능
- 게시글 목록 조회 기능
- 게시글 상세보기 기능
- 사용자 정보 수정 기능
<br/>

### API 설계
<img width="1043" alt="스크린샷 2024-04-14 오후 1 57 42" src="https://github.com/codesquad-members-2024/be-spring-cafe/assets/86272865/99bd9707-b018-438a-8ffb-f4230e46112c">
<br/><br/>
<img width="1044" alt="스크린샷 2024-04-14 오후 1 57 53" src="https://github.com/codesquad-members-2024/be-spring-cafe/assets/86272865/1798b06c-cfaa-47cb-b86d-2f563e885f03">
<br/><br/>

### 실행 화면
#### 게시글 기능
- 아무 게시글이 없을 때의 홈 화면(/)이다.
<img width="1352" alt="스크린샷 2024-04-14 오후 1 39 55" src="https://github.com/codesquad-members-2024/be-spring-cafe/assets/86272865/8e845b29-42d2-42e5-8900-05dffc09dc5d">
<br/><br/>

- 게시글을 작성하는 화면이다.
<img width="1352" alt="스크린샷 2024-04-14 오후 1 40 45" src="https://github.com/codesquad-members-2024/be-spring-cafe/assets/86272865/f4b93b3a-7759-4ca7-ad31-b994157a5b79">
<br/><br/>

- 게시글 작성 후 게시글이 등록된 홈 화면(/)이다.
<img width="1352" alt="스크린샷 2024-04-14 오후 1 45 21" src="https://github.com/codesquad-members-2024/be-spring-cafe/assets/86272865/15ca3c02-453e-4234-a425-3f34c8be15bf">
<br/><br/>

- 등록된 게시글의 상세보기 화면이다.
<img width="1350" alt="스크린샷 2024-04-14 오후 1 45 30" src="https://github.com/codesquad-members-2024/be-spring-cafe/assets/86272865/713daa8c-acad-4a24-8b7b-abb152a38fd2">
<br/><br/>

#### 사용자 기능
- 현재 가입된 사용자를 조회한다.
<img width="1352" alt="스크린샷 2024-04-14 오후 1 46 46" src="https://github.com/codesquad-members-2024/be-spring-cafe/assets/86272865/71ab1a28-ef53-4ba5-b489-362524938e3d">
<br/><br/>

- 사용자의 프로필 화면에서 **정보 수정** 링크를 누를 수 있다.
<img width="1352" alt="스크린샷 2024-04-14 오후 1 46 55" src="https://github.com/codesquad-members-2024/be-spring-cafe/assets/86272865/fca63203-e8f0-4730-a91d-5b0c1a428bd4">
<br/><br/>

- 현재 비밀번호 정보가 일치하면 사용자의 정보가 수정된다.
<img width="1352" alt="스크린샷 2024-04-14 오후 1 48 34" src="https://github.com/codesquad-members-2024/be-spring-cafe/assets/86272865/fee16c84-1652-422f-9cf6-9d2a7e83c0f7">
<br/><br/>

- 새로 수정된 사용자 정보가 나타난다.
<img width="1352" alt="스크린샷 2024-04-14 오후 1 48 45" src="https://github.com/codesquad-members-2024/be-spring-cafe/assets/86272865/2548c45d-8f87-4054-8a5a-a355153e9268">
<br/><br/>

## 기타
- Controller에서 Dto 객체를 사용하도록 수정했는데, 적절하게 사용하기 위한 고민을 많이 했습니다.
- 아직 로그인 기능이 구현되지 않아서 게시글 작성자를 전부 **익명**으로 처리한 점이 아쉬웠습니다.

<br>

## step-3 DB에 저장하기
### 구현 내용
- H2 데이터베이스 연동
- Spring Jdbc를 사용한 코드 작성
- 게시글 저장 기능, 게시글 목록 기능, 게시글 상세보기 기능, 사용자 정보 저장 기능
- EC2 배포
### H2 DB 연동
<img width="396" alt="스크린샷 2024-04-19 오전 2 02 15" src="https://github.com/codesquad-members-2024/be-spring-cafe/assets/86272865/8c4c2a9c-2a86-44e2-9bc0-9d475cf365d2">
<br/><br/>
<img width="440" alt="스크린샷 2024-04-19 오전 2 00 52" src="https://github.com/codesquad-members-2024/be-spring-cafe/assets/86272865/42ac1cb3-51b4-4642-873d-d771b3200bf6">

### 배포 화면
<img width="1352" alt="스크린샷 2024-04-19 오전 1 43 11" src="https://github.com/codesquad-members-2024/be-spring-cafe/assets/86272865/15b20ee9-c987-4236-a2ae-bf53c331721e">

## 기타
- Article과 User 테이블 모두 auto_increment primary key를 설정했습니다.
- 사용자도 가입한 날짜를 저장하기 위한 created 필드를 생성했습니다.
<img width="418" alt="스크린샷 2024-04-19 오전 2 06 12" src="https://github.com/codesquad-members-2024/be-spring-cafe/assets/86272865/74deea68-c9ae-4f2c-b452-38ccffc4eb4d">
<br/><br/>
<img width="427" alt="스크린샷 2024-04-19 오전 2 06 20" src="https://github.com/codesquad-members-2024/be-spring-cafe/assets/86272865/94fc6a28-0e97-4790-ab4f-7dcc321abbb0">

<br>

## step-4 로그인 구현
### 구현 내용
- HttpSession을 이용한 로그인, 로그아웃 기능 구현
- 로그인된 사용자의 개인정보 수정 기능 구현
- 타임리프 문법으로 로그인 여부에 따라 다른 상단 메뉴 구현
- Interceptor를 통해 비로그인 사용자 페이지 접근 제한 구현

### API 설계
<img width="1006" alt="스크린샷 2024-04-21 오후 3 30 09" src="https://github.com/codesquad-members-2024/be-spring-cafe/assets/86272865/289e1fa9-071b-4159-aefe-c81644b8b77d">
<br/><br/>
<img width="1001" alt="스크린샷 2024-04-21 오후 3 31 29" src="https://github.com/codesquad-members-2024/be-spring-cafe/assets/86272865/57f875a3-3ec8-4eb1-9bba-e66393e6b325">
<br/><br/>

### 실행화면
- 비로그인 사용자의 홈 화면 (비로그인 사용자는 홈, 로그인, 회원가입 페이지 외는 모두 접근 불가)
<img width="1352" alt="스크린샷 2024-04-21 오후 3 10 10" src="https://github.com/codesquad-members-2024/be-spring-cafe/assets/86272865/5ffa1b1b-bd54-49d3-81df-2bb27854f544">
<br/><br/>

- 로그인 사용자의 홈 화면
<img width="1352" alt="스크린샷 2024-04-21 오후 3 10 00" src="https://github.com/codesquad-members-2024/be-spring-cafe/assets/86272865/2375d853-d12c-4452-b444-4ab76c1f3031">
<br/><br/>

- 로그인 페이지에서 아이디 또는 비밀번호가 틀렸을 때
<img width="1352" alt="스크린샷 2024-04-21 오후 3 11 37" src="https://github.com/codesquad-members-2024/be-spring-cafe/assets/86272865/1faf8e61-b29b-4c4a-9027-ecc7b5ac2d95">
<br/><br/>

- 개인정보 수정 페이지에서 현재 비밀번호가 틀렸을 때
<img width="1352" alt="스크린샷 2024-04-21 오후 3 10 46" src="https://github.com/codesquad-members-2024/be-spring-cafe/assets/86272865/978de5e3-0d35-46de-849e-f4941026c751">
<br/><br/>

<br>

## step-5 게시글 권한부여
### 구현 내용
- 비로그인 사용자가 홈/로그인/회원가입 페이지 외에 접근하면 로그인 화면으로 redirect
- 비로그인 사용자가 로그인 이전에 접근한 url이 있으면, 로그인 후 해당 url로 이동
- 로그인 사용자 본인의 프로필 수정 기능
- 로그인 사용자 본인의 게시글 수정 기능
- 로그인 사용자 본인의 게시글 삭제 기능
- CustomException 클래스 작성 및 에러 페이지 추가
- 게시글 조회수 증가 구현

### API 설계
<img width="1009" alt="스크린샷 2024-04-25 오후 12 38 40" src="https://github.com/codesquad-members-2024/be-spring-cafe/assets/86272865/727cdfbf-b1cd-4708-a91b-8d00a0e4623c">
<br/><br/>
<img width="1007" alt="스크린샷 2024-04-25 오후 12 38 50" src="https://github.com/codesquad-members-2024/be-spring-cafe/assets/86272865/cf38a188-15fa-4bdf-a853-89bae813f436">
<br/><br/>

### 실행 화면
- 본인의 게시글을 누른 경우 수정하기, 삭제하기 버튼이 표시된다.
<img width="1352" alt="스크린샷 2024-04-25 오전 11 14 48" src="https://github.com/codesquad-members-2024/be-spring-cafe/assets/86272865/a82a25f1-71c1-4f7d-a7d0-0913a3c60ef7">
<br/><br/>

- 본인의 게시글인 경우 게시글을 수정할 수 있다.
<img width="1351" alt="스크린샷 2024-04-25 오전 11 15 18" src="https://github.com/codesquad-members-2024/be-spring-cafe/assets/86272865/996c6c09-f7ee-430d-afb2-8fe568b8315e">
<br/><br/>

- 다른 사용자의 게시글인 경우 수정하기, 삭제하기 버튼이 없다.
<img width="1348" alt="스크린샷 2024-04-25 오전 11 19 30" src="https://github.com/codesquad-members-2024/be-spring-cafe/assets/86272865/4f538be7-07e4-4c11-a152-dd894ad97fe0">
<br/><br/>

- 다른 사용자의 개인정보는 수정할 수 없다.
<img width="1352" alt="스크린샷 2024-04-25 오전 11 19 44" src="https://github.com/codesquad-members-2024/be-spring-cafe/assets/86272865/2211f74e-67d7-4b49-9f12-27e3ae8401d8">
<br/><br/>

## 기타
- 게시글 수정 기능을 구현하면서 article 테이블에 lastModifedDate 필드를 추가했습니다.
<img width="485" alt="스크린샷 2024-04-25 오후 12 26 59" src="https://github.com/codesquad-members-2024/be-spring-cafe/assets/86272865/cf366fcc-c6f5-4141-9fc0-8bcb9f71203a">

<br>

## step-6 댓글
### 구현 내용
- 게시글 상세보기에서 댓글 조회 기능
- 로그인 사용자의 댓글 추가/삭제 기능
- 게시글 삭제 기능 (댓글이 있는 경우 함께 삭제)
- 댓글 삭제 기능
- 삭제 기능에서 데이터 삭제 대신 deleted 필드를 true로 변경

### API 설계
<img width="1007" alt="스크린샷 2024-04-30 오전 2 26 07" src="https://github.com/codesquad-members-2024/be-spring-cafe/assets/86272865/4ace68fe-5c3f-44dd-a7a3-d010b5044cc4">
<br/><br/>

## 기타
- soft delete 구현을 위해 Article, Reply 테이블에 deleted 필드를 추가했습니다.
<img width="484" alt="스크린샷 2024-04-30 오전 3 11 56" src="https://github.com/codesquad-members-2024/be-spring-cafe/assets/86272865/716f1592-6806-424e-8be2-60c2a23d6659">
<br/><br/>
<img width="468" alt="스크린샷 2024-04-30 오전 3 12 04" src="https://github.com/codesquad-members-2024/be-spring-cafe/assets/86272865/7339a60d-5ccb-4058-ba22-08b82756ba4f">

<br>
