-- liquibase formatted sql

-- changeset ofcmail:6
CREATE TABLE IF NOT EXISTS comment(
    id              SERIAL PRIMARY KEY,
    created_at      TIMESTAMP NOT NULL,
    text            TEXT NOT NULL,
    ads_id          INTEGER REFERENCES ads(id),
    author_id       INTEGER REFERENCES users(id)
);