DROP table account cascade;
DROP table category cascade;
DROP table mprice cascade;
DROP table item cascade;



create table account(
  account_id bigint constraint ac_id primary key, 
  account_name varchar(200) not null constraint ac_name unique,
  account_password varchar(200) not null constraint ac_password unique,
  account_created timestamp,
  account_modified timestamp
  );


  create table category(
  category_id bigint constraint ca_id primary key, 
  category_name varchar(200) not null constraint ca_name unique,
  category_created timestamp,
  category_modified timestamp
  );



  create table item(
  item_id bigint constraint item_id primary key,
  item_account_id bigint not null,
  item_category_id bigint not null,

  item_name varchar(200) not null constraint item_name unique,
  item_created timestamp,
  item_modified timestamp,
  item_timetoend timestamp,
  item_curprice bigint,
  item_minprice bigint
  );

alter table item
    add constraint fk_item_account foreign key(item_account_id)
    references account;

alter table item
    add constraint fk_item_author foreign key(item_author_id)
    references author;

alter table item
    add constraint fk_item_category foreign key(item_category_id)
    references category;


  

  