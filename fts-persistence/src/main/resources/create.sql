INSERT INTO public.AIRLINES(id, name) VALUES (1, 'Airline_1')
INSERT INTO public.AIRLINES(id, name) VALUES (2, 'Airline_2')
INSERT INTO public.AIRLINES(id, name) VALUES (3, 'Airline_3')


INSERT INTO public.AIRPLANES(id, code, seats, airline_id) VALUES (1, 'Z01', 123, 1)
INSERT INTO public.AIRPLANES(id, code, seats, airline_id) VALUES (2, 'Z02', 321, 2)
INSERT INTO public.AIRPLANES(id, code, seats, airline_id) VALUES (3, 'Z03', 321, 3)

INSERT INTO public.AIRPORTS(id, city, code, country, name) VALUES (1, 'City_1', 'PT1', 'Country_1', 'Airport_1')
INSERT INTO public.AIRPORTS(id, city, code, country, name) VALUES (2, 'City_2', 'PT2', 'Country_2', 'Airport_2')
INSERT INTO public.AIRPORTS(id, city, code, country, name) VALUES (3, 'City_3', 'PT3', 'Country_3', 'Airport_3')

INSERT INTO public.FLIGHTS(id, arrivaldate, departuredate, airplane_id, arrival_airport_id, departure_airport_id) VALUES (1, to_timestamp('2018-07-22 12:27:57.321','YYYY/MM/DD HH24:MI:SS.MS'), to_timestamp('2018-07-23 12:27:57.321','YYYY/MM/DD HH24:MI:SS.MS'), 1, 1, 2)
INSERT INTO public.FLIGHTS(id, arrivaldate, departuredate, airplane_id, arrival_airport_id, departure_airport_id) VALUES (2, to_timestamp('2017-07-22 12:27:57.321','YYYY/MM/DD HH24:MI:SS.MS'), to_timestamp('2018-07-22 12:27:57.321','YYYY/MM/DD HH24:MI:SS.MS'), 2, 3, 2)
