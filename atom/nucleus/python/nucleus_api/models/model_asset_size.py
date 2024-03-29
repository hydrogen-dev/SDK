# coding: utf-8

"""
    Hydrogen Nucleus API

    The Hydrogen Nucleus API  # noqa: E501

    OpenAPI spec version: 1.9.5
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six

from nucleus_api.configuration import Configuration


class ModelAssetSize(object):
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
        'asset_size': 'float',
        'create_date': 'datetime',
        'currency_code': 'str',
        '_date': 'date',
        'id': 'str',
        'is_reconciled': 'bool',
        'model_id': 'str',
        'secondary_id': 'str',
        'update_date': 'datetime'
    }

    attribute_map = {
        'asset_size': 'asset_size',
        'create_date': 'create_date',
        'currency_code': 'currency_code',
        '_date': 'date',
        'id': 'id',
        'is_reconciled': 'is_reconciled',
        'model_id': 'model_id',
        'secondary_id': 'secondary_id',
        'update_date': 'update_date'
    }

    def __init__(self, asset_size=None, create_date=None, currency_code=None, _date=None, id=None, is_reconciled=None, model_id=None, secondary_id=None, update_date=None, _configuration=None):  # noqa: E501
        """ModelAssetSize - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._asset_size = None
        self._create_date = None
        self._currency_code = None
        self.__date = None
        self._id = None
        self._is_reconciled = None
        self._model_id = None
        self._secondary_id = None
        self._update_date = None
        self.discriminator = None

        self.asset_size = asset_size
        if create_date is not None:
            self.create_date = create_date
        if currency_code is not None:
            self.currency_code = currency_code
        self._date = _date
        if id is not None:
            self.id = id
        if is_reconciled is not None:
            self.is_reconciled = is_reconciled
        self.model_id = model_id
        if secondary_id is not None:
            self.secondary_id = secondary_id
        if update_date is not None:
            self.update_date = update_date

    @property
    def asset_size(self):
        """Gets the asset_size of this ModelAssetSize.  # noqa: E501

        Model asset_size  # noqa: E501

        :return: The asset_size of this ModelAssetSize.  # noqa: E501
        :rtype: float
        """
        return self._asset_size

    @asset_size.setter
    def asset_size(self, asset_size):
        """Sets the asset_size of this ModelAssetSize.

        Model asset_size  # noqa: E501

        :param asset_size: The asset_size of this ModelAssetSize.  # noqa: E501
        :type: float
        """
        if self._configuration.client_side_validation and asset_size is None:
            raise ValueError("Invalid value for `asset_size`, must not be `None`")  # noqa: E501

        self._asset_size = asset_size

    @property
    def create_date(self):
        """Gets the create_date of this ModelAssetSize.  # noqa: E501


        :return: The create_date of this ModelAssetSize.  # noqa: E501
        :rtype: datetime
        """
        return self._create_date

    @create_date.setter
    def create_date(self, create_date):
        """Sets the create_date of this ModelAssetSize.


        :param create_date: The create_date of this ModelAssetSize.  # noqa: E501
        :type: datetime
        """

        self._create_date = create_date

    @property
    def currency_code(self):
        """Gets the currency_code of this ModelAssetSize.  # noqa: E501

        currency_code  # noqa: E501

        :return: The currency_code of this ModelAssetSize.  # noqa: E501
        :rtype: str
        """
        return self._currency_code

    @currency_code.setter
    def currency_code(self, currency_code):
        """Sets the currency_code of this ModelAssetSize.

        currency_code  # noqa: E501

        :param currency_code: The currency_code of this ModelAssetSize.  # noqa: E501
        :type: str
        """

        self._currency_code = currency_code

    @property
    def _date(self):
        """Gets the _date of this ModelAssetSize.  # noqa: E501

        Model asset_size date  # noqa: E501

        :return: The _date of this ModelAssetSize.  # noqa: E501
        :rtype: date
        """
        return self.__date

    @_date.setter
    def _date(self, _date):
        """Sets the _date of this ModelAssetSize.

        Model asset_size date  # noqa: E501

        :param _date: The _date of this ModelAssetSize.  # noqa: E501
        :type: date
        """
        if self._configuration.client_side_validation and _date is None:
            raise ValueError("Invalid value for `_date`, must not be `None`")  # noqa: E501

        self.__date = _date

    @property
    def id(self):
        """Gets the id of this ModelAssetSize.  # noqa: E501


        :return: The id of this ModelAssetSize.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this ModelAssetSize.


        :param id: The id of this ModelAssetSize.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def is_reconciled(self):
        """Gets the is_reconciled of this ModelAssetSize.  # noqa: E501

        Model asset_size is reconciled  # noqa: E501

        :return: The is_reconciled of this ModelAssetSize.  # noqa: E501
        :rtype: bool
        """
        return self._is_reconciled

    @is_reconciled.setter
    def is_reconciled(self, is_reconciled):
        """Sets the is_reconciled of this ModelAssetSize.

        Model asset_size is reconciled  # noqa: E501

        :param is_reconciled: The is_reconciled of this ModelAssetSize.  # noqa: E501
        :type: bool
        """

        self._is_reconciled = is_reconciled

    @property
    def model_id(self):
        """Gets the model_id of this ModelAssetSize.  # noqa: E501

        Model asset_size Model id  # noqa: E501

        :return: The model_id of this ModelAssetSize.  # noqa: E501
        :rtype: str
        """
        return self._model_id

    @model_id.setter
    def model_id(self, model_id):
        """Sets the model_id of this ModelAssetSize.

        Model asset_size Model id  # noqa: E501

        :param model_id: The model_id of this ModelAssetSize.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and model_id is None:
            raise ValueError("Invalid value for `model_id`, must not be `None`")  # noqa: E501

        self._model_id = model_id

    @property
    def secondary_id(self):
        """Gets the secondary_id of this ModelAssetSize.  # noqa: E501


        :return: The secondary_id of this ModelAssetSize.  # noqa: E501
        :rtype: str
        """
        return self._secondary_id

    @secondary_id.setter
    def secondary_id(self, secondary_id):
        """Sets the secondary_id of this ModelAssetSize.


        :param secondary_id: The secondary_id of this ModelAssetSize.  # noqa: E501
        :type: str
        """

        self._secondary_id = secondary_id

    @property
    def update_date(self):
        """Gets the update_date of this ModelAssetSize.  # noqa: E501


        :return: The update_date of this ModelAssetSize.  # noqa: E501
        :rtype: datetime
        """
        return self._update_date

    @update_date.setter
    def update_date(self, update_date):
        """Sets the update_date of this ModelAssetSize.


        :param update_date: The update_date of this ModelAssetSize.  # noqa: E501
        :type: datetime
        """

        self._update_date = update_date

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
        if issubclass(ModelAssetSize, dict):
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
        if not isinstance(other, ModelAssetSize):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, ModelAssetSize):
            return True

        return self.to_dict() != other.to_dict()
