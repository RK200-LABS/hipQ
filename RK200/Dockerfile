# 1. OpenJDK 17 기반 이미지 사용
FROM openjdk:17-jdk-slim

# 2. 작업 디렉토리 설정
WORKDIR /app

# 3. JAR 파일을 컨테이너로 복사 (전체 경로 사용)
COPY ./build/libs/RK200-0.0.1-SNAPSHOT.jar app.jar

# 4. 컨테이너 실행 시 JAR 파일 실행
ENTRYPOINT ["java", "-jar", "app.jar"]
