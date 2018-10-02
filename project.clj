(defproject migratus-lein "0.6.2"
  :description "Maintain database migrations."
  :url "http://github.com/pjstadig/migratus-lein"
  :license {:name "Apache License, Version 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0.html"
            :distribution :repo}
  :eval-in-leiningen true
  :aliases {"test!" ["do" "clean," "test"]}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [migratus "1.1.1"]]
  :profiles {:dev {:dependencies [[jar-migrations "1.0.0"]]}})
