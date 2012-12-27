(defproject migratus-lein "0.1.0"
  :description "MIGRATE ALL THE THINGS!"
  :eval-in-leiningen true
  :aliases {"test!" ["do" "clean," "test"]}
  :dependencies [[org.clojure/clojure "1.2.1"]
                 [migratus "0.6.0"]]
  :profiles {:dev {:dependencies [[jar-migrations "1.0.0"]
                                  [log4j "1.2.16"]]}})
