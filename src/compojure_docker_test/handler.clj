(ns compojure-docker-test.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
            [clojure.tools.logging :as log]))

(defroutes app-routes
  (GET "/" [] "Hello World")
  (GET "/:word" [word]
       (log/info "Received" word "as input")
       (str "Thanks for saying " word " to me"))
  (route/not-found "Not Found"))

(def app
  (wrap-defaults app-routes site-defaults))
