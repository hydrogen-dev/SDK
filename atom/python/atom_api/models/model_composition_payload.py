# coding: utf-8

"""
    Hydrogen Atom API

    The Hydrogen Atom API  # noqa: E501

    OpenAPI spec version: 1.0.1
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six

from atom_api.models.model_composition_payload_holdings import ModelCompositionPayloadHoldings  # noqa: F401,E501


class ModelCompositionPayload(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'model_id': 'str',
        'holdings': 'list[ModelCompositionPayloadHoldings]',
        'sell_transaction_code_id': 'str',
        'buy_transaction_code_id': 'str'
    }

    attribute_map = {
        'model_id': 'model_id',
        'holdings': 'holdings',
        'sell_transaction_code_id': 'sell_transaction_code_id',
        'buy_transaction_code_id': 'buy_transaction_code_id'
    }

    def __init__(self, model_id=None, holdings=None, sell_transaction_code_id=None, buy_transaction_code_id=None):  # noqa: E501
        """ModelCompositionPayload - a model defined in Swagger"""  # noqa: E501

        self._model_id = None
        self._holdings = None
        self._sell_transaction_code_id = None
        self._buy_transaction_code_id = None
        self.discriminator = None

        self.model_id = model_id
        self.holdings = holdings
        self.sell_transaction_code_id = sell_transaction_code_id
        self.buy_transaction_code_id = buy_transaction_code_id

    @property
    def model_id(self):
        """Gets the model_id of this ModelCompositionPayload.  # noqa: E501

        The ID of the model whose holdings are to be updated  # noqa: E501

        :return: The model_id of this ModelCompositionPayload.  # noqa: E501
        :rtype: str
        """
        return self._model_id

    @model_id.setter
    def model_id(self, model_id):
        """Sets the model_id of this ModelCompositionPayload.

        The ID of the model whose holdings are to be updated  # noqa: E501

        :param model_id: The model_id of this ModelCompositionPayload.  # noqa: E501
        :type: str
        """
        if model_id is None:
            raise ValueError("Invalid value for `model_id`, must not be `None`")  # noqa: E501

        self._model_id = model_id

    @property
    def holdings(self):
        """Gets the holdings of this ModelCompositionPayload.  # noqa: E501

        The information for the new holding records to be created  # noqa: E501

        :return: The holdings of this ModelCompositionPayload.  # noqa: E501
        :rtype: list[ModelCompositionPayloadHoldings]
        """
        return self._holdings

    @holdings.setter
    def holdings(self, holdings):
        """Sets the holdings of this ModelCompositionPayload.

        The information for the new holding records to be created  # noqa: E501

        :param holdings: The holdings of this ModelCompositionPayload.  # noqa: E501
        :type: list[ModelCompositionPayloadHoldings]
        """
        if holdings is None:
            raise ValueError("Invalid value for `holdings`, must not be `None`")  # noqa: E501

        self._holdings = holdings

    @property
    def sell_transaction_code_id(self):
        """Gets the sell_transaction_code_id of this ModelCompositionPayload.  # noqa: E501

        The transaction_code_id to be populated in any model transaction to sell securities  # noqa: E501

        :return: The sell_transaction_code_id of this ModelCompositionPayload.  # noqa: E501
        :rtype: str
        """
        return self._sell_transaction_code_id

    @sell_transaction_code_id.setter
    def sell_transaction_code_id(self, sell_transaction_code_id):
        """Sets the sell_transaction_code_id of this ModelCompositionPayload.

        The transaction_code_id to be populated in any model transaction to sell securities  # noqa: E501

        :param sell_transaction_code_id: The sell_transaction_code_id of this ModelCompositionPayload.  # noqa: E501
        :type: str
        """
        if sell_transaction_code_id is None:
            raise ValueError("Invalid value for `sell_transaction_code_id`, must not be `None`")  # noqa: E501

        self._sell_transaction_code_id = sell_transaction_code_id

    @property
    def buy_transaction_code_id(self):
        """Gets the buy_transaction_code_id of this ModelCompositionPayload.  # noqa: E501

        The transaction_code_id to be populated in any model transaction to buy securities  # noqa: E501

        :return: The buy_transaction_code_id of this ModelCompositionPayload.  # noqa: E501
        :rtype: str
        """
        return self._buy_transaction_code_id

    @buy_transaction_code_id.setter
    def buy_transaction_code_id(self, buy_transaction_code_id):
        """Sets the buy_transaction_code_id of this ModelCompositionPayload.

        The transaction_code_id to be populated in any model transaction to buy securities  # noqa: E501

        :param buy_transaction_code_id: The buy_transaction_code_id of this ModelCompositionPayload.  # noqa: E501
        :type: str
        """
        if buy_transaction_code_id is None:
            raise ValueError("Invalid value for `buy_transaction_code_id`, must not be `None`")  # noqa: E501

        self._buy_transaction_code_id = buy_transaction_code_id

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value
        if issubclass(ModelCompositionPayload, dict):
            for key, value in self.items():
                result[key] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, ModelCompositionPayload):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
