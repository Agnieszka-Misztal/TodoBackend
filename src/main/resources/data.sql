insert into todo(id, username, description, target_date, is_completed)
values(1001, 'user', 'Upiec ciasteczka', PARSEDATETIME('01 Jan 2020, 05:15:58 AM','dd MMM yyyy, hh:mm:ss a','en'), false);

insert into todo(id, username, description, target_date, is_completed)
values(1003, 'user', 'Zjesc ciasteczka', sysdate(), true);

insert into todo(id, username, description, target_date, is_completed)
values(1004, 'user', 'Zdać sesję', PARSEDATETIME('01 Mar 2019, 05:15:58 AM','dd MMM yyyy, hh:mm:ss a','en'), false);

insert into todo(id, username, description, target_date, is_completed)
values(1005, 'user', 'Kupic ciasteczka', sysdate(), false);

insert into todo(id, username, description, target_date, is_completed)
values(1006, 'user', 'Przeczytac ksiazke X', PARSEDATETIME('14 Jan 2019, 05:15:58 AM','dd MMM yyyy, hh:mm:ss a','en'), true);