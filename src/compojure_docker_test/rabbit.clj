(ns compojure-docker-test.rabbit
  (:require [langohr.core      :as rmq]
            [langohr.channel   :as lch]
            [langohr.queue     :as lq]
            [langohr.consumers :as lc]
            [langohr.exchange  :as le]
            [langohr.basic     :as lb]))
