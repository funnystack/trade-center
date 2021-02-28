CREATE TABLE `user_info` (
                             `id` bigint(20) NOT NULL AUTO_INCREMENT,
                             `user_name` varchar(255) NOT NULL COMMENT '用户名',
                             `user_pwd` varchar(255) DEFAULT NULL COMMENT '用户密码',
                             `mobile_encrypt` varchar(100) DEFAULT NULL COMMENT '手机号加密',
                             `mobile_hash` varchar(64) DEFAULT NULL COMMENT '手机号hash',
                             `gmt_created` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
                             `gmt_modified` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
                             `is_del` tinyint(4) NOT NULL DEFAULT '0',
                             PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COMMENT='用户基础信息表';


CREATE TABLE `user_wx_info` (
                                `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '自增主键',
                                `user_id` bigint(20) NOT NULL COMMENT '用户id',
                                `open_id` varchar(100) NOT NULL COMMENT 'openid',
                                `union_id` varchar(100) DEFAULT NULL COMMENT 'unionId ',
                                `wx_phone` varchar(100) DEFAULT NULL COMMENT 'phone ',
                                `wx_nick_name` varchar(255) DEFAULT NULL COMMENT '昵称',
                                `wx_gender` varchar(10) DEFAULT NULL COMMENT '性别',
                                `wx_country` varchar(255) DEFAULT NULL COMMENT '国家',
                                `wx_city` varchar(255) DEFAULT NULL COMMENT '城市',
                                `wx_province` varchar(255) DEFAULT NULL COMMENT '省份',
                                `wx_avatar_url` varchar(255) DEFAULT NULL COMMENT '头像url',
                                `gmt_created` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                                `gmt_modified` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
                                `is_del` int(11) NOT NULL DEFAULT '0' COMMENT '状态 0:正常,1已删除',
                                PRIMARY KEY (`id`),
                                KEY `idx_openid` (`open_id`),
                                KEY `idx_user_id` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户微信表';
CREATE TABLE `user_address` (
                                `id` bigint(20) NOT NULL AUTO_INCREMENT,
                                `user_id` varchar(30) NOT NULL,
                                `user_type` tinyint(4) NOT NULL DEFAULT '1' COMMENT '1 用户地址',
                                `country_id` int(11) DEFAULT '0' COMMENT '国家',
                                `country_name` varchar(50) DEFAULT NULL COMMENT '国家名',
                                `province_id` int(11) DEFAULT '0' COMMENT '省份id',
                                `province_name` varchar(100) DEFAULT NULL COMMENT '省份名称',
                                `city_id` int(11) DEFAULT '0' COMMENT '城市id',
                                `city_name` varchar(100) DEFAULT NULL COMMENT '城市name',
                                `county_id` int(11) DEFAULT '0' COMMENT '区县id',
                                `county_name` varchar(100) DEFAULT NULL COMMENT '区县name',
                                `address_encrypt` varchar(255) DEFAULT NULL COMMENT '区县name',
                                `mobile_encrypt` varchar(255) DEFAULT NULL COMMENT '手机号',
                                `contact_person_encrypt` varchar(255) DEFAULT NULL COMMENT '联系人',
                                `labels` varchar(255) DEFAULT NULL COMMENT '标签集合',
                                `is_default` tinyint(4) NOT NULL DEFAULT '1' COMMENT '是否默认地址',
                                `gmt_created` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
                                `gmt_modified` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
                                `is_del` tinyint(4) NOT NULL DEFAULT '0',
                                PRIMARY KEY (`id`),
                                KEY `idx_user_id` (`user_id`,`user_type`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户地址表';

CREATE TABLE `user_invoice` (
                                `id` bigint(20) NOT NULL AUTO_INCREMENT,
                                `user_id` varchar(30) NOT NULL,
                                `invoice_title` varchar(1000) DEFAULT NULL COMMENT '发票抬头(个人名称/企业名称)',
                                `invoice_title_type` tinyint(4) NOT NULL DEFAULT '1' COMMENT '发票抬头类型 1用户 2企业',
                                `invoice_type` tinyint(4) NOT NULL DEFAULT '1' COMMENT '发票类型 1电子普通发票 2增值税专用发票',
                                `tax_payer_code` varchar(20) DEFAULT NULL COMMENT '纳税人识别码',
                                `register_address` varchar(255) DEFAULT NULL COMMENT '注册地址',
                                `register_mobile` varchar(100) DEFAULT NULL COMMENT '注册电话',
                                `bank_account` varchar(100) DEFAULT NULL COMMENT '银行账号',
                                `bank_name` varchar(200) DEFAULT NULL COMMENT '开户银行',
                                `receive_email_encrypt` varchar(100) DEFAULT NULL COMMENT '收票人手机',
                                `receive_mobile_encrypt` varchar(50) DEFAULT NULL COMMENT '收票人邮箱',
                                `invoice_content` varchar(50) DEFAULT NULL COMMENT '发票内容',
                                `gmt_created` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
                                `gmt_modified` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
                                `is_del` tinyint(4) NOT NULL DEFAULT '0',
                                PRIMARY KEY (`id`),
                                KEY `idx_user_id` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户发票表';