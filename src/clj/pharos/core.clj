(ns pharos.core
  (:use [hiccup.core])
  (:require [compojure.core :as c]
            [compojure.route :as c-route]
            [compojure.handler :as c-handler]
            [compojure.response :as c-resp]
            [ring.adapter.jetty :as r-jetty]
            [ring.util.response :as r-resp]
            [ring.middleware.file :as m-file]
            [ring.middleware.file-info :as m-finfo]
            [ring.middleware.stacktrace :as m-stacktrace]
            [ring.middleware.reload :as m-reload]
            [hiccup.core :refer :all :as h]
            [hiccup.middleware :refer (wrap-base-url)]))

(defn home-page []
  (html
   [:html
    [:head
     [:title "Pharos"]]
    [:body
     [:h1 "Pharos"]
     [:p "This is a paragraph about pharos."]]]))

(c/defroutes app-routes
  (c/GET "/" [] (home-page))
  (c-route/resources "/")
  (c-route/not-found "Page not found"))

(def app
  (-> (c-handler/site app-routes)
      (wrap-base-url)))
