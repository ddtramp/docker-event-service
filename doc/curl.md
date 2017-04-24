




    START_AT=$(date +"%Y-%m-%d") && END_AT=$(date +"%Y-%m-%d") && curl -H "Content-type: application/json" -d "{\"name\": \"测试活动\", \"numberLimit\": 20, \"mainPhoto\": \"http://localhost/image/main_photo.pnd\", \"introduction\": \"活动介绍\", \"startAt\": \"$START_AT\", \"endAT\": \"END_AT\"}" http://localhost:8080/events
    
