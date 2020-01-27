(ns reframe-2020+.views
  (:require
   [re-frame.core :as re-frame]
   [reframe-2020+.subs :as subs]
   [garden.core :refer [css]]))

(def body-copy []
  (css {:font-family "Helvetica"
   :font-weight 400
   :font-style "normal"
   :font-size "16px"
   :text-align "left"
   :color "red"}))


(defn main-panel []
  (let [name (re-frame/subscribe [::subs/name])]
    [:div (body-copy)
     [:p "Hello from " @name]
     [:h1 "Hello from " {:class "foobar"}]
     ]))
