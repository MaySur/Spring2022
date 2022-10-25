const redis = reqire("redis");
const client=redis.createClient();

// Basic Operations

//SET  GET

client.set("transactions",123, redis.print) //OK
client.get("transactions",redis.print) //123