/*
 * Hydrogen Nucleus API
 *
 * The Hydrogen Nucleus API
 *
 * API version: 1.9.5
 * Contact: info@hydrogenplatform.com
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */

package nucleus_api

// NodeRelationship Object
type NodeRelationship struct {
	// answer_id
	AnswerId   string `json:"answer_id"`
	CreateDate string `json:"create_date,omitempty"`
	// decision_tree_id
	DecisionTreeId string `json:"decision_tree_id"`
	Id             string `json:"id,omitempty"`
	// is_leaf
	IsLeaf   bool              `json:"is_leaf,omitempty"`
	Metadata map[string]string `json:"metadata,omitempty"`
	// nodeChildId
	NodeChildId string `json:"node_child_id,omitempty"`
	// nodeParentId
	NodeParentId string `json:"node_parent_id"`
	SecondaryId  string `json:"secondary_id,omitempty"`
	UpdateDate   string `json:"update_date,omitempty"`
	// value
	Value string `json:"value"`
}
