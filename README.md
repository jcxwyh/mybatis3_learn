# Mybatis
**官方文档地址：`http://www.mybatis.org/mybatis-3/zh/index.html`**
>  4个核心组件
> - `SqlSessionFactoryBuilder`
> > 它会根据配置或者代码来生成`SqlSessionFactory`，采用的是分布构建的Builder模式
> - `SqlSessionFactory`
> > 使用工厂模式生成SqlSession
> - `SqlSession`
> > 会话，数据库交互
> - SQL Mapper
> > 即是映射器，用作将接口与mapper文件按相应规则实现数据库访问与返回结果

## 配置文件


## 映射文件
> - `select`
> > `id`:与Mapper的命名空间结合使用
> > `parameterType`：
> > `resultType`

## 注解
- - -
```java
@Alias >>> <typeAlia/>
@Select >>> <select/>
@update >>> <update/>
@delete >>> <delete/>
@insert >>> <insert/>


```
- - -
