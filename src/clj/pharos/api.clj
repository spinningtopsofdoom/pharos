(ns pharos.api
  "API for Phraos")

(defn add-documentation
  "Adds documentation for a symbol to a queue to be reviewed for acceptance.

  Input is a map with the following keys

  id (required, keyword) - The unique identifier that documentation is to be attached to
  meta (optional, map) - Any meta data for the updated documentation

  Returns a map with a documentation-id (uuid type) if successful otherwise an error code and error message
  "
  [{:keys [id meta] :as doc-map}]
  {})

(defn commit-documentation
  "Commits acceptance or rejection of an update to documentation.

  documentation-id (required, uuid) - Identifier for the set of documentation changes
  doc-meta (optional, map) - Optional meta data

  Returns a map with success / error information
  "
  [documentation-id {:keys [doc-meta] :or {doc-meta {}}}]
  {})

(defn documentation-to-html
  "Converts documentation parameters to a map of the html created and status

  Input is a map containing the following keys

  id (required, keyword) - The unique identifier that documentation is to be made into html
  meta (optional, map) - Any meta data for the html to be generated

  Returns a map with a status code and the generated html
  "
  [{:keys [id meta] :as doc-map}]
  {:status 500
   :html "<html><head></head><body><div>Not Implemented Yet</div></body></html>"})

(defn current-documentation
  "Query to get current documentation information for a symbol or symbols

  Input is a map containing the following keys

  id (required, keyword) - The unique identifier to find the current documentation information
  meta (optional, map) - Any meta data for the query

  Returns a vector of maps that contain the current documentation information
  "
  [{:keys [id meta] :as doc-map}]
  [{}])

(defn pending-documentation
  "Query to get pending documentation information for a symbol or symbols

  Input is a map containing the following keys

  id (required, keyword) - The unique identifier to find the current documentation information
  meta (optional, map) - Any meta data for the query

  Returns a vector of maps that contain the pending documentation information
  "
  [{:keys [meta] :as doc-map}]
  {})
(defn api-doc
  "Gets the documentation for the Pharos API

  meta (optional, map) - Meta data concerning the API documentation

  Returns a vector of maps that contain the pending documentation information
  "
  [& {:keys [meta] :or {meta {}}}]
  {})
