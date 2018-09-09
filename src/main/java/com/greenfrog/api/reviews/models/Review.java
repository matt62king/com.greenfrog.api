package com.greenfrog.api.reviews.models;

import com.google.cloud.datastore.Key;
import com.greenfrog.utils.datastore.fecher.annotaions.IndexedID;
import com.greenfrog.utils.datastore.mapper.annotations.Column;
import com.greenfrog.utils.datastore.mapper.annotations.EntityKey;
import com.greenfrog.utils.datastore.mapper.annotations.Store;

@Store(value = "reviews", cache = true)
public class Review {
    @EntityKey
    private Key key;

    @Column("review_name")
    private String name;

    @IndexedID
    @Column("review_email")
    private String email;

    @Column("review_message")
    private String message;

    public void setKey(Key key) {
        this.key = key;
    }

    public Key getKey() {
        return key;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Review that = (Review) o;

        if (key != null ? !key.equals(that.key) : that.key != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        return message != null ? message.equals(that.message) : that.message == null;
    }

    @Override
    public int hashCode() {
        int result = key != null ? key.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (message != null ? message.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ReviewBean{" +
                "key=" + key +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
