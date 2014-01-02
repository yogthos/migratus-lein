(ns example.test.core
  (:require [clojure.java.jdbc.deprecated :as sql]
            [clojure.test :refer :all]
            [example.core :refer :all]
            [migratus.database :refer :all]))

(def config {:store :database
             :migration-dir "migrations/"
             :migration-table-name "foo_bar"
             :db {:classname "com.mysql.jdbc.Driver"
                  :subprotocol "mysql"
                  :subname "//localhost/migratus"
                  :user "root"
                  :password ""}})

(defn verify-table-exists? [table-name]
  (sql/with-connection (:db config)
    (table-exists? table-name)))

(deftest test-migrate
  (is (verify-table-exists? "foo"))
  (is (verify-table-exists? "bar"))
  (is (verify-table-exists? "quux"))
  (is (verify-table-exists? "quux2")))
