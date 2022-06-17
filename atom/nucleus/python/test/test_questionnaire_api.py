# coding: utf-8

"""
    Hydrogen Nucleus API

    The Hydrogen Nucleus API  # noqa: E501

    OpenAPI spec version: 1.9.5
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

import unittest

import nucleus_api
from nucleus_api.api.questionnaire_api import QuestionnaireApi  # noqa: E501
from nucleus_api.rest import ApiException


class TestQuestionnaireApi(unittest.TestCase):
    """QuestionnaireApi unit test stubs"""

    def setUp(self):
        self.api = nucleus_api.api.questionnaire_api.QuestionnaireApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_create_answer_using_post(self):
        """Test case for create_answer_using_post

        Create an answer  # noqa: E501
        """
        pass

    def test_create_question_using_post(self):
        """Test case for create_question_using_post

        Create a question  # noqa: E501
        """
        pass

    def test_create_questionnaire_using_post(self):
        """Test case for create_questionnaire_using_post

        Create a questionnaire  # noqa: E501
        """
        pass

    def test_delete_answer_using_delete(self):
        """Test case for delete_answer_using_delete

        Delete an answer  # noqa: E501
        """
        pass

    def test_delete_question_using_delete(self):
        """Test case for delete_question_using_delete

        Delete a question  # noqa: E501
        """
        pass

    def test_delete_questionnaire_using_delete(self):
        """Test case for delete_questionnaire_using_delete

        Delete a questionnaire  # noqa: E501
        """
        pass

    def test_get_answer_all_using_get(self):
        """Test case for get_answer_all_using_get

        List all Answers  # noqa: E501
        """
        pass

    def test_get_answer_using_get(self):
        """Test case for get_answer_using_get

        Retrieve an answer  # noqa: E501
        """
        pass

    def test_get_question_all_using_get(self):
        """Test case for get_question_all_using_get

        List all Questions  # noqa: E501
        """
        pass

    def test_get_question_using_get(self):
        """Test case for get_question_using_get

        Retrieve a question  # noqa: E501
        """
        pass

    def test_get_questionnaire_all_using_get(self):
        """Test case for get_questionnaire_all_using_get

        List all questionnaires  # noqa: E501
        """
        pass

    def test_get_questionnaire_using_get(self):
        """Test case for get_questionnaire_using_get

        Retrieve a questionnaire  # noqa: E501
        """
        pass

    def test_update_answer_using_put(self):
        """Test case for update_answer_using_put

        Update an answer  # noqa: E501
        """
        pass

    def test_update_question_using_put(self):
        """Test case for update_question_using_put

        Update a question.  # noqa: E501
        """
        pass

    def test_update_questionnaire_using_put(self):
        """Test case for update_questionnaire_using_put

        Update a questionnaire  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
