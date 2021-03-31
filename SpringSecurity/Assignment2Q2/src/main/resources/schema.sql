INSERT INTO users(username,password,enabled)
VALUES ('shalaka','$2a$10$EblZqNptyYvcLm/VwDCVAuBjzZOI7khzdyGPBr08PpIi0na624b8.', true);

INSERT INTO user_roles (username, role)
VALUES ('shalaka', 'ROLE_USER');
INSERT INTO user_roles (username, role)
VALUES ('shalaka', 'ROLE_ADMIN');