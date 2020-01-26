(ns reframe-2020.views
  (:require
   [re-frame.core :as re-frame]
   [reframe-2020.subs :as subs]
   ))

(defn main-panel []
  (let [name (re-frame/subscribe [::subs/name])]
    [:div
     [:h1 "Hello from " @name]
     ]))
