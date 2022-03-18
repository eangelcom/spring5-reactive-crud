
create table IF NOT EXISTS TODO (
	id SERIAL PRIMARY KEY, 
	text varchar (255) not null, 
	topic varchar (20) not null,
	completed boolean default false
);