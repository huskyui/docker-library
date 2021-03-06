## 参考
[mysql主从复制](https://juejin.cn/post/6844903631141994510)
## desc
mysql主从，需要注意的是，我们在创建mysql时，需要注意一下操作
刚开始，我是希望挂载的方式将my.cnf挂载进去，但是失败了
于是采用add的方式将my.cnf放入了镜像中
### 如何运行，使mysql进行主从复制呢
#### step1
先连接master
```sql
show master status;
show slave status;
```
再连接slave
```sql
show master status;
show slave status;
```
#### step2
在slave使用

```sql
CHANGE MASTER TO
    MASTER_HOST='mysql-master',
    MASTER_USER='root',
    MASTER_PASSWORD='happyday',
    MASTER_LOG_FILE='replicas-mysql-bin.000003',
    MASTER_LOG_POS=154;
```
其中，`master_host`就是`docker-compose.yml` 中`mysql-master`的hostname,会在
slave容器中的` /etc/hosts `中存在。`master_password`就是master的连接密码
`master_log_file`和`master_log_pos`就是在主节点使用`show master status`，展示的数据
#### step3
在slave执行
```sql
stop slave;
start slave;
```