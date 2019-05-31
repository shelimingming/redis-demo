package com.sheliming.jedis;

import redis.clients.jedis.Jedis;

/**
 * jedis连接单机版本的redis
 */
public class SingleJedisDemo {
    public static void main(String[] args) {
        String redisHost = "192.168.61.129";
        int redisPort = 6379;

        //连接本地的 Redis 服务
        Jedis jedis = new Jedis(redisHost, redisPort);
        System.out.println("Connection to server sucessfully");

        //查看服务是否运行
        System.out.println("Server is running: " + jedis.ping());

        //插入数据
        jedis.set("set_key", "set_value");
        System.out.println(jedis.get("set_key"));

        //修改数据
        jedis.set("set_key", "set_value2");
        System.out.println(jedis.get("set_key"));

        //删除数据
        jedis.del("set_key");
        System.out.println(jedis.get("set_key"));
    }
}
