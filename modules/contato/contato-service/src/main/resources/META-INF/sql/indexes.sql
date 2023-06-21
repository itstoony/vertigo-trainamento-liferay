create index IX_925F6391 on Contato_Contato (email[$COLUMN_LENGTH:75$]);
create index IX_A15C6FAF on Contato_Contato (groupId);
create index IX_19BD1C8F on Contato_Contato (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_F9B17AD1 on Contato_Contato (uuid_[$COLUMN_LENGTH:75$], groupId);