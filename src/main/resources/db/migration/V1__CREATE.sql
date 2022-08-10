CREATE TABLE IF NOT EXISTS category
(
    id uuid NOT NULL,
    timestamp_created timestamp without time zone NOT NULL,
    timestamp_modified timestamp without time zone NOT NULL,
    description character varying(255),
    name character varying(255),
    CONSTRAINT category_pkey PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS product
(
    id uuid NOT NULL,
    timestamp_created timestamp without time zone NOT NULL,
    timestamp_modified timestamp without time zone NOT NULL,
    availability boolean NOT NULL,
    description character varying(255),
    image_path character varying(255),
    name character varying(255),
    price double precision NOT NULL,
    category_id uuid,
    CONSTRAINT product_pkey PRIMARY KEY (id),
    CONSTRAINT fk1mtsbur82frn64de7balymq9s FOREIGN KEY (category_id)
    REFERENCES category (id)
);

insert into category (id, timestamp_created, timestamp_modified, name, description) values ('0cca852b-9ee6-4cea-8be9-5e34ca4bb85f', '2004-10-19 10:23:54', '2004-10-19 10:23:54', 'Toyota', 'Celica');
insert into category (id, timestamp_created, timestamp_modified, name, description) values ('01dafe58-a787-418c-8c30-9ac64436e61c', '2004-10-19 10:23:54', '2004-10-19 10:23:54', 'Pontiac', 'Grand Prix');
insert into category (id, timestamp_created, timestamp_modified, name, description) values ('860b0975-dd44-4a37-844e-69bd91c90fb6', '2004-10-19 10:23:54', '2004-10-19 10:23:54', 'Oldsmobile', 'Cutlass Supreme');
insert into category (id, timestamp_created, timestamp_modified, name, description) values ('7daf8b8c-2803-4891-b13d-153ce89cb391', '2004-10-19 10:23:54', '2004-10-19 10:23:54', 'Hyundai', 'Tiburon');
insert into category (id, timestamp_created, timestamp_modified, name, description) values ('dc838cee-ed71-4ad3-b840-cdb1e3b0e606', '2004-10-19 10:23:54', '2004-10-19 10:23:54', 'Audi', '5000CS Quattro');

insert into product (id, timestamp_created, timestamp_modified, availability, description, name, price, category_id) values ('5d361e2c-baed-4d7e-addf-b2ef7660d3c2', '2004-10-19 10:23:54', '2004-10-19 10:23:54', false, '2-260 - Excavation Support and Protection', 'Zooveo', 63, 'dc838cee-ed71-4ad3-b840-cdb1e3b0e606');
insert into product (id, timestamp_created, timestamp_modified, availability, description, name, price, category_id) values ('fdf59312-804e-4e74-8c02-b3037311f239', '2004-10-19 10:23:54', '2004-10-19 10:23:54', true, '12-800 - Interior Plants and Planters', 'Youspan', 45, 'dc838cee-ed71-4ad3-b840-cdb1e3b0e606');
insert into product (id, timestamp_created, timestamp_modified, availability, description, name, price, category_id) values ('3e8fa8c7-4119-4996-b624-b072de223dd6', '2004-10-19 10:23:54', '2004-10-19 10:23:54', true, '13-400 - Measurement and Control Instrumentation', 'Jamia', 68, 'dc838cee-ed71-4ad3-b840-cdb1e3b0e606');
insert into product (id, timestamp_created, timestamp_modified, availability, description, name, price, category_id) values ('7812c59e-2d96-4ed6-a369-4712f55e1bfb', '2004-10-19 10:23:54', '2004-10-19 10:23:54', false, '1-760 - Protecting Installed Construction', 'Eazzy', 4, '7daf8b8c-2803-4891-b13d-153ce89cb391');
insert into product (id, timestamp_created, timestamp_modified, availability, description, name, price, category_id) values ('35a59456-51ac-4c3a-b035-550b5baf3626', '2004-10-19 10:23:54', '2004-10-19 10:23:54', true, '10-900 - Wardrobe and Closet Specialties', 'Oyonder', 90, '7daf8b8c-2803-4891-b13d-153ce89cb391');