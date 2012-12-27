(defproject migratus-lein "0.1.0"
  :description "MIGRATE ALL THE THINGS!"
  :url "http://github.com/pjstadig/migratus-lein"
  :license {:name "Apache License, Version 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0.html"
            :distribution :repo}
  :eval-in-leiningen true
  :aliases {"test!" ["do" "clean," "test"]}
  :dependencies [[org.clojure/clojure "1.2.1"]
                 [migratus "0.6.0"]]
  :profiles {:dev {:dependencies [[jar-migrations "1.0.0"]
                                  [log4j "1.2.16"]]}})
