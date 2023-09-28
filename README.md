# otus_1.6
Otus Microservice Architecture 
ДЗ 1.6

docker hub - andrey1andrey/otus_1.6

http://arch.homework/health/

Простое Rest-приложение с одним endpoint "get на /health/"
с манифестами для его разворачивания в kubernetes (deployment, service, ingress)

Описание/Пошаговая инструкция выполнения домашнего задания:
Шаг 1. Создать минимальный сервис, который

отвечает на порту 8000
имеет http-метод
GET /health/
RESPONSE: {"status": "OK"}
Шаг 2. Cобрать локально образ приложения в докер.
Запушить образ в dockerhub
Шаг 3. Написать манифесты для деплоя в k8s для этого сервиса.
Манифесты должны описывать сущности: Deployment, Service, Ingress.
В Deployment могут быть указаны Liveness, Readiness пробы.
Количество реплик должно быть не меньше 2. Image контейнера должен быть указан с Dockerhub.
Хост в ингрессе должен быть arch.homework. В итоге после применения манифестов GET запрос на http://arch.homework/health должен отдавать {“status”: “OK”}.
