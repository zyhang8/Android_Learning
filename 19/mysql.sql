use android_test;

# user_table
create table auction_user(
  user_id int(11) auto_increment,
  username varchar(50) not null,
  userpass varchar(50) not null,
  email varchar(100) not null,
  primary key(user_id),
  unique(username)
);

INSERT INTO auction_user (username,userpass,email) VALUES ('tomcat','tomcat','spring_test@163.com');
INSERT INTO auction_user (username,userpass,email) VALUES ('mysql','mysql','spring_test@163.com');

# item_category_table
create table kind(
  kind_id int(11) auto_increment,
  kind_name varchar(50) not null, 
  kind_desc varchar(255) not null,
  primary key(kind_id)
);

INSERT INTO kind (kind_name,kind_desc) VALUES ('computer_hardware','it is not a very mainstream product here, but the price is absolutely heartening to you.');
INSERT INTO kind (kind_name,kind_desc) VALUES ('house_property','tigongfengchangxiquedefnagyuan');

# item_state_table
create table state(
  state_id int(11) auto_increment,
  state_name varchar(10),
  primary key(state_id)
);

INSERT INTO state (state_name) VALUES ('auction');
INSERT INTO state (state_name) VALUES ('pai');
INSERT INTO state (state_name) VALUES ('auctioning');

# item_tables
create table item(
  item_id int(11) auto_increment,
  item_name varchar(255) not null,
  item_remark varchar(255),
  item_desc varchar(255),
  kind_id int(11) not null, 
  addtime date not null,
  endtime date not null,
  init_price double not null, 
  max_price double not null, 
  owner_id int(11) not null, 
  winer_id int(11), 
  state_id int(11) not null, 
  primary key(item_id),
  FOREIGN KEY(kind_id) REFERENCES kind(kind_id),
  FOREIGN KEY(owner_id) REFERENCES auction_user(user_id),
  FOREIGN KEY(winer_id) REFERENCES auction_user(user_id),
  FOREIGN KEY(state_id) REFERENCES state(state_id)
); 

# auction_item
INSERT INTO item ( item_name , item_remark , item_desc, kind_id, addtime , endtime, init_price,  max_price,  owner_id,  winer_id,  state_id)
	VALUES ( 'mainboard', 'old_board', 'old-board_can_use', 1, ADDDATE(CURDATE(), -5), ADDDATE(CURDATE(), 30) , 230, 250, 1,  null,  1);
# 流派的物品
INSERT INTO item ( item_name , item_remark , item_desc, kind_id, addtime , endtime, init_price,  max_price,  owner_id,  winer_id,  state_id)
	VALUES ( 'graphics_card', 'old_graphics_card', 'old_graphics_card_can_use', 1, ADDDATE(CURDATE(), -9), ADDDATE(CURDATE(), -2), 210, 210, 2,  null,  3);
# 被竞得的物品
INSERT INTO item ( item_name , item_remark , item_desc, kind_id, addtime , endtime, init_price,  max_price,  owner_id,  winer_id,  state_id)
	VALUES ( 'old_house', 'old_style_house', '40_year_old_house', 2, ADDDATE(CURDATE(), -9), ADDDATE(CURDATE(), -5), 21000, 25000, 2,  1,  2);

# bid_history_table
create table bid(
  bid_id int(11) auto_increment,
  user_id int(11) not null,
  item_id int(11) not null,
  bid_price double not null,
  bid_date date not null, 
  primary key(bid_id),
  unique(item_id , bid_price),
  FOREIGN KEY(user_id) REFERENCES auction_user(user_id), 
  FOREIGN KEY(item_id) REFERENCES item(item_id)   
);

INSERT INTO bid ( user_id , item_id , bid_price, bid_date)
	VALUES ( 2, 1, 250, ADDDATE(CURDATE(), -2));
INSERT INTO bid ( user_id , item_id , bid_price, bid_date)
	VALUES ( 1, 3, 25000, ADDDATE(CURDATE(), -6));

