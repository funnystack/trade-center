CREATE TABLE `item` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `category_id` bigint(20) DEFAULT NULL COMMENT '商品itemid',
  `category_name` varchar(200)  DEFAULT NULL COMMENT '商品名称 ',
  `item_pattern` int(11) DEFAULT '1' COMMENT '商品形态：1实物商品、2虚拟商品、3服务商品',


  `shop_id` bigint(20) DEFAULT NULL COMMENT '店铺id',
  `shop_name` varchar(255)  DEFAULT NULL COMMENT '商品名称',
  `seller_id` bigint(20) DEFAULT NULL COMMENT '商家id',
  `seller_name` varchar(255)  DEFAULT NULL COMMENT '商家名',
  `flag` int(11) DEFAULT '1' COMMENT '标记位，进行二进制打标',

  `biz_type` varchar(255)  DEFAULT NULL COMMENT '所属业务平台',

  `image_url` varchar(255) DEFAULT NULL COMMENT '图片url',

  `num` int(11) DEFAULT NULL COMMENT '商品数量',
  `price` decimal(18,2) DEFAULT NULL COMMENT '价格',
  `original_price` decimal(18,2) DEFAULT NULL COMMENT '原价',
  `cart_status` int(11) NOT NULL DEFAULT '0' COMMENT '状态 0:正常,1已下单',
  `checked_status` int(11) NOT NULL DEFAULT '0' COMMENT '选中状态 0未选中,1选中',
  `seller_id` int(11) DEFAULT NULL COMMENT '商家id',
  `seller_name` varchar(255) DEFAULT NULL COMMENT '商家名称',
  `user_id` bigint(20) DEFAULT '0' COMMENT '用户id',
  `ext_json` varchar(1000)  DEFAULT NULL COMMENT '传参的json串',
  `item_url` varchar(255)  DEFAULT NULL COMMENT '商品详情页url',
  `gmt_created` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gmt_modified` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `is_del` int(11) NOT NULL DEFAULT '0' COMMENT '状态 0:正常,1已删除',
  PRIMARY KEY (`id`),
  KEY `idx_userid_platform_status` (`user_id`,`cart_status`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COMMENT='购物车表';