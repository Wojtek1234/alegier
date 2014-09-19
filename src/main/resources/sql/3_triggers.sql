drop function account_insert_function() cascade;
drop function account_update_function() cascade;

drop function item_insert_function() cascade;
drop function item_update_function() cascade;
drop function category_insert_function() cascade;
drop function category_update_function() cascade;
drop function mprice_insert_function() cascade;
drop function mprice_update_function() cascade;


create function account_insert_function() returns trigger AS $account_insert_function$

begin 
if NEW.account_created is NULL then 
NEW.account_created := localtimestamp; 
end if; 
  if NEW.account_modified  is NULL then
    NEW.account_modified  := localtimestamp; 
  end if; 

return new;
end;
$account_insert_function$ LANGUAGE plpgsql;

create  trigger account_INSERT
before insert on account
for each row execute procedure account_insert_function(); 

create function account_update_function() returns trigger AS $account_update_function$

begin 
if NEW.account_created is NULL then 
NEW.account_created := localtimestamp; 
else
    NEW.account_modified  := localtimestamp; 
  end if; 

return new;
end;
$account_update_function$ LANGUAGE plpgsql;

create  trigger account_update
before update on account
for each row execute procedure account_update_function(); 


create function item_insert_function() returns trigger AS $item_insert_function$

begin 
if NEW.item_created is NULL then
NEW.item_created := localtimestamp;
end if; 
  if NEW.item_modified  is NULL then
    NEW.item_modified  := localtimestamp;
  end if; 

return new;
end;
item_insert_function LANGUAGE plpgsql;

create  trigger book_INSERT
before insert on book
for each row execute procedure item_insert_function();

create function item_update_function() returns trigger AS item_update_function

begin 
if NEW.item_created is NULL then
NEW.item_created := localtimestamp;
else
    NEW.item_modified  := localtimestamp;
  end if; 

return new;
end;
item_update_function LANGUAGE plpgsql;

create  trigger item_update
before update on item
for each row execute procedure item_update_function();

create function category_insert_function() returns trigger AS $category_insert_function$

begin 
if NEW.category_created is NULL then 
NEW.category_created := localtimestamp; 
end if; 
  if NEW.category_modified  is NULL then
    NEW.category_modified  := localtimestamp; 
  end if; 

return new;
end;
$category_insert_function$ LANGUAGE plpgsql;

create  trigger category_INSERT
before insert on category
for each row execute procedure category_insert_function(); 

create function category_update_function() returns trigger AS $category_update_function$

begin 
if NEW.category_created is NULL then 
NEW.category_created := localtimestamp; 
else
    NEW.category_modified  := localtimestamp; 
  end if; 

return new;
end;
$category_update_function$ LANGUAGE plpgsql;

create  trigger category_update
before update on category
for each row execute procedure category_update_function(); 

create function mprice_insert_function() returns trigger AS $mprice_insert_function$

begin 
if NEW.mprice_created is NULL then
NEW.mprice_created := localtimestamp;
end if; 
  if NEW.mprice_modified  is NULL then
    NEW.mprice_modified  := localtimestamp;
  end if; 

return new;
end;
$mprice_insert_function$ LANGUAGE plpgsql;

create  trigger mprice_INSERT
before insert on mprice
for each row execute procedure mprice_insert_function();

create function mprice_update_function() returns trigger AS $mprice_update_function$

begin 
if NEW.mprice_created is NULL then
NEW.mprice_created := localtimestamp;
else
    NEW.mprice_modified  := localtimestamp;
  end if; 

return new;
end;
$mprice_update_function$ LANGUAGE plpgsql;

create  trigger mprice_update
before update on mprice
for each row execute procedure mprice_update_function();