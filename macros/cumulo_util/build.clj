
(ns cumulo-util.build
  (:require [clojure.string :as string])
  (:import (java.net InetAddress)))

(defmacro get-ip! []
  (.getHostAddress (InetAddress/getLocalHost)))

(defmacro inline-resource [resource-path]
  (slurp resource-path))
