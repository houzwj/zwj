# zwj


1.首先执行项目中的sql脚本：init.sql 生成表并初始化数据
2.从git上clone代码： git clone https://github.com/houzwj/zwj.git
3.进入到源代码所在的目录：执行命令： mvn eclipse:eclipse 将工程转换成eclipse工程
4.将工程导入eclipse,用maven 编译、安装、打包项目
5.部署到web容器，如tomcat、jetty

主要API:
1.获取所有部门
http://localhost:8080/restdemo/department
2.根据部门id获取部门信息、上级部门、下级部门、该部门员工 、删除部门
http://localhost:8080/restdemo/department/{id}
3.增加部门、修改部门
http://localhost:8080/restdemo/department