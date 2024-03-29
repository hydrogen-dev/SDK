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

// Question Object
type Question struct {
	Answers []Answer `json:"answers,omitempty"`
	// category
	Category   string `json:"category,omitempty"`
	CreateDate string `json:"create_date,omitempty"`
	// description
	Description string `json:"description,omitempty"`
	// document
	Document string `json:"document,omitempty"`
	Id       string `json:"id,omitempty"`
	// image
	Image string `json:"image,omitempty"`
	// is_account
	IsAccount bool `json:"is_account,omitempty"`
	// metadata
	Metadata map[string]string `json:"metadata,omitempty"`
	// order_index
	OrderIndex string `json:"order_index,omitempty"`
	// question_type
	QuestionType  string         `json:"question_type,omitempty"`
	Questionnaire *Questionnaire `json:"questionnaire,omitempty"`
	// questionnaireId
	QuestionnaireId string `json:"questionnaire_id,omitempty"`
	SecondaryId     string `json:"secondary_id,omitempty"`
	// subcategory
	Subcategory string `json:"subcategory,omitempty"`
	// title
	Title string `json:"title,omitempty"`
	// tooltip
	Tooltip    string `json:"tooltip,omitempty"`
	UpdateDate string `json:"update_date,omitempty"`
	// weight
	Weight float64 `json:"weight,omitempty"`
}
