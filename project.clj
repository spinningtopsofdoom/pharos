(defproject pharos "0.0.1-SNAPSHOT"
  :description "Clojure Doumentation Tool"
  :url "https://github.com/spinningtopsofdoom/pharos"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.1.8"]
                 [ring "1.3.0"]
                 [hiccup "1.0.5"]]
  :plugins [[lein-ring "0.8.11"]]
  :ring {:handler pharos.core/app
         :port 3000}
  :source-paths  ["src/clj"])
