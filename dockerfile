# 1️⃣ Maven을 포함한 기본 이미지 사용
FROM maven:3.8.8-eclipse-temurin-11

# 2️⃣ 작업 디렉토리 설정
WORKDIR /app

# 3️⃣ 프로젝트 전체 파일을 컨테이너 내부로 복사
COPY . /app

# 4️⃣ Maven을 사용하여 프로젝트 빌드
RUN mvn package -DskipTests

# 5️⃣ 애플리케이션 실행
CMD ["java", "-jar", "target/study-0.0.1-SNAPSHOT.jar"]
