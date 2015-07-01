(defproject example-project "0.1.1"
  :description "Migratus Leiningen plugin example project"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [com.h2database/h2 "1.4.187"]
                 [migratus "0.8.0"]]
  :plugins [[migratus-lein "0.1.1"]]
  :migratus {:store :database
             :migration-dir "migrations/"
             :db {:classname "org.h2.Driver"
                  :subprotocol "h2"
                  :subname (str (.getName (clojure.java.io/file ".")) "/example-project")}})
