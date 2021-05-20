

docker run -d  -p 27017:27017 --name first-mongo2 -e MONGO_INITDB_ROOT_USERNAME=user2 -e MONGO_INITDB_ROOT_PASSWORD=0 mongo:latest


use admin
db.createUser(
{
user: "user1",
pwd: "user1",
roles: [ "userAdminAnyDatabase" ]
}
)
db.grantRolesToUser(
"user1",
[
{ role: "readWrite", db: "db1" }
]
)

