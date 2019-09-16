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

from atom_api.models.secondary_id import SecondaryId  # noqa: F401,E501


class ModelAssetSizePayload(object):
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
        '_date': 'date',
        'asset_size': 'float',
        'is_reconciled': 'bool',
        'model_id': 'str',
        'currency_code': 'str',
        'secondary_id': 'SecondaryId'
    }

    attribute_map = {
        '_date': 'date',
        'asset_size': 'asset_size',
        'is_reconciled': 'is_reconciled',
        'model_id': 'model_id',
        'currency_code': 'currency_code',
        'secondary_id': 'secondary_id'
    }

    def __init__(self, _date=None, asset_size=None, is_reconciled=None, model_id=None, currency_code=None, secondary_id=None):  # noqa: E501
        """ModelAssetSizePayload - a model defined in Swagger"""  # noqa: E501

        self.__date = None
        self._asset_size = None
        self._is_reconciled = None
        self._model_id = None
        self._currency_code = None
        self._secondary_id = None
        self.discriminator = None

        self._date = _date
        self.asset_size = asset_size
        self.is_reconciled = is_reconciled
        self.model_id = model_id
        if currency_code is not None:
            self.currency_code = currency_code
        if secondary_id is not None:
            self.secondary_id = secondary_id

    @property
    def _date(self):
        """Gets the _date of this ModelAssetSizePayload.  # noqa: E501

        Date for this asset size record  # noqa: E501

        :return: The _date of this ModelAssetSizePayload.  # noqa: E501
        :rtype: date
        """
        return self.__date

    @_date.setter
    def _date(self, _date):
        """Sets the _date of this ModelAssetSizePayload.

        Date for this asset size record  # noqa: E501

        :param _date: The _date of this ModelAssetSizePayload.  # noqa: E501
        :type: date
        """
        if _date is None:
            raise ValueError("Invalid value for `_date`, must not be `None`")  # noqa: E501

        self.__date = _date

    @property
    def asset_size(self):
        """Gets the asset_size of this ModelAssetSizePayload.  # noqa: E501

        “Growth of a dollar” within the model on the particular date  # noqa: E501

        :return: The asset_size of this ModelAssetSizePayload.  # noqa: E501
        :rtype: float
        """
        return self._asset_size

    @asset_size.setter
    def asset_size(self, asset_size):
        """Sets the asset_size of this ModelAssetSizePayload.

        “Growth of a dollar” within the model on the particular date  # noqa: E501

        :param asset_size: The asset_size of this ModelAssetSizePayload.  # noqa: E501
        :type: float
        """
        if asset_size is None:
            raise ValueError("Invalid value for `asset_size`, must not be `None`")  # noqa: E501

        self._asset_size = asset_size

    @property
    def is_reconciled(self):
        """Gets the is_reconciled of this ModelAssetSizePayload.  # noqa: E501

        Indicates the asset size record is reconciled. true means it is reconciled  # noqa: E501

        :return: The is_reconciled of this ModelAssetSizePayload.  # noqa: E501
        :rtype: bool
        """
        return self._is_reconciled

    @is_reconciled.setter
    def is_reconciled(self, is_reconciled):
        """Sets the is_reconciled of this ModelAssetSizePayload.

        Indicates the asset size record is reconciled. true means it is reconciled  # noqa: E501

        :param is_reconciled: The is_reconciled of this ModelAssetSizePayload.  # noqa: E501
        :type: bool
        """
        if is_reconciled is None:
            raise ValueError("Invalid value for `is_reconciled`, must not be `None`")  # noqa: E501

        self._is_reconciled = is_reconciled

    @property
    def model_id(self):
        """Gets the model_id of this ModelAssetSizePayload.  # noqa: E501

        The ID of the model for the asset size record  # noqa: E501

        :return: The model_id of this ModelAssetSizePayload.  # noqa: E501
        :rtype: str
        """
        return self._model_id

    @model_id.setter
    def model_id(self, model_id):
        """Sets the model_id of this ModelAssetSizePayload.

        The ID of the model for the asset size record  # noqa: E501

        :param model_id: The model_id of this ModelAssetSizePayload.  # noqa: E501
        :type: str
        """
        if model_id is None:
            raise ValueError("Invalid value for `model_id`, must not be `None`")  # noqa: E501

        self._model_id = model_id

    @property
    def currency_code(self):
        """Gets the currency_code of this ModelAssetSizePayload.  # noqa: E501

        Alphabetic currency code for the base currency of the model, limited to 3 characters  # noqa: E501

        :return: The currency_code of this ModelAssetSizePayload.  # noqa: E501
        :rtype: str
        """
        return self._currency_code

    @currency_code.setter
    def currency_code(self, currency_code):
        """Sets the currency_code of this ModelAssetSizePayload.

        Alphabetic currency code for the base currency of the model, limited to 3 characters  # noqa: E501

        :param currency_code: The currency_code of this ModelAssetSizePayload.  # noqa: E501
        :type: str
        """

        self._currency_code = currency_code

    @property
    def secondary_id(self):
        """Gets the secondary_id of this ModelAssetSizePayload.  # noqa: E501


        :return: The secondary_id of this ModelAssetSizePayload.  # noqa: E501
        :rtype: SecondaryId
        """
        return self._secondary_id

    @secondary_id.setter
    def secondary_id(self, secondary_id):
        """Sets the secondary_id of this ModelAssetSizePayload.


        :param secondary_id: The secondary_id of this ModelAssetSizePayload.  # noqa: E501
        :type: SecondaryId
        """

        self._secondary_id = secondary_id

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
        if issubclass(ModelAssetSizePayload, dict):
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
        if not isinstance(other, ModelAssetSizePayload):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
