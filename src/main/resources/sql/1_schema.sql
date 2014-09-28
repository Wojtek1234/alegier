DROP table account cascade;
DROP table category cascade;
DROP table item cascade;



CREATE TABLE account
(
  account_name text NOT NULL,
  account_id bigint NOT NULL,
  CONSTRAINT au_id PRIMARY KEY (account_id)
)
WITH (
  OIDS=TRUE
);
ALTER TABLE account
  OWNER TO postgres;

CREATE TABLE category
  (
    category_id bigint NOT NULL,
    category_name text NOT NULL,
    CONSTRAINT cat_id PRIMARY KEY (category_id)
  )
  WITH (
    OIDS=FALSE
  );
  ALTER TABLE category
    OWNER TO postgres;

CREATE TABLE item
(
  item_account_id bigint,
  item_id bigint NOT NULL,
  item_category_id bigint,
  item_price bigint,
  item_expired timestamp with time zone,
  item_picture bytea[],
  item_name text NOT NULL,
  CONSTRAINT ite_id PRIMARY KEY (item_id),
  CONSTRAINT it_ac_id FOREIGN KEY (item_account_id)
      REFERENCES account (account_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT it_cat_id FOREIGN KEY (item_category_id)
      REFERENCES category (category_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE item
  OWNER TO postgres;


alter table item
    add constraint fk_item_account foreign key(item_account_id)
    references account;

alter table item
    add constraint fk_item_author foreign key(item_author_id)
    references author;

alter table item
    add constraint fk_item_category foreign key(item_category_id)
    references category;


  

  