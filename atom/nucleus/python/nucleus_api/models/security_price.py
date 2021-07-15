# coding: utf-8

"""
    Hydrogen Nucleus API

    The Hydrogen Nucleus API  # noqa: E501

    OpenAPI spec version: 1.9.3
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six

from nucleus_api.configuration import Configuration


class SecurityPrice(object):
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
        'adjusted_price': 'float',
        'create_date': 'datetime',
        'currency_code': 'str',
        '_date': 'datetime',
        'high': 'float',
        'id': 'str',
        'low': 'float',
        'open': 'float',
        'price': 'float',
        'secondary_id': 'str',
        'security_id': 'str',
        'update_date': 'datetime',
        'volume': 'float'
    }

    attribute_map = {
        'adjusted_price': 'adjusted_price',
        'create_date': 'create_date',
        'currency_code': 'currency_code',
        '_date': 'date',
        'high': 'high',
        'id': 'id',
        'low': 'low',
        'open': 'open',
        'price': 'price',
        'secondary_id': 'secondary_id',
        'security_id': 'security_id',
        'update_date': 'update_date',
        'volume': 'volume'
    }

    def __init__(self, adjusted_price=None, create_date=None, currency_code=None, _date=None, high=None, id=None, low=None, open=None, price=None, secondary_id=None, security_id=None, update_date=None, volume=None, _configuration=None):  # noqa: E501
        """SecurityPrice - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._adjusted_price = None
        self._create_date = None
        self._currency_code = None
        self.__date = None
        self._high = None
        self._id = None
        self._low = None
        self._open = None
        self._price = None
        self._secondary_id = None
        self._security_id = None
        self._update_date = None
        self._volume = None
        self.discriminator = None

        if adjusted_price is not None:
            self.adjusted_price = adjusted_price
        if create_date is not None:
            self.create_date = create_date
        if currency_code is not None:
            self.currency_code = currency_code
        self._date = _date
        if high is not None:
            self.high = high
        if id is not None:
            self.id = id
        if low is not None:
            self.low = low
        if open is not None:
            self.open = open
        self.price = price
        if secondary_id is not None:
            self.secondary_id = secondary_id
        self.security_id = security_id
        if update_date is not None:
            self.update_date = update_date
        if volume is not None:
            self.volume = volume

    @property
    def adjusted_price(self):
        """Gets the adjusted_price of this SecurityPrice.  # noqa: E501

        Security adjusted price  # noqa: E501

        :return: The adjusted_price of this SecurityPrice.  # noqa: E501
        :rtype: float
        """
        return self._adjusted_price

    @adjusted_price.setter
    def adjusted_price(self, adjusted_price):
        """Sets the adjusted_price of this SecurityPrice.

        Security adjusted price  # noqa: E501

        :param adjusted_price: The adjusted_price of this SecurityPrice.  # noqa: E501
        :type: float
        """

        self._adjusted_price = adjusted_price

    @property
    def create_date(self):
        """Gets the create_date of this SecurityPrice.  # noqa: E501


        :return: The create_date of this SecurityPrice.  # noqa: E501
        :rtype: datetime
        """
        return self._create_date

    @create_date.setter
    def create_date(self, create_date):
        """Sets the create_date of this SecurityPrice.


        :param create_date: The create_date of this SecurityPrice.  # noqa: E501
        :type: datetime
        """

        self._create_date = create_date

    @property
    def currency_code(self):
        """Gets the currency_code of this SecurityPrice.  # noqa: E501

        currency_code  # noqa: E501

        :return: The currency_code of this SecurityPrice.  # noqa: E501
        :rtype: str
        """
        return self._currency_code

    @currency_code.setter
    def currency_code(self, currency_code):
        """Sets the currency_code of this SecurityPrice.

        currency_code  # noqa: E501

        :param currency_code: The currency_code of this SecurityPrice.  # noqa: E501
        :type: str
        """

        self._currency_code = currency_code

    @property
    def _date(self):
        """Gets the _date of this SecurityPrice.  # noqa: E501

        Security date  # noqa: E501

        :return: The _date of this SecurityPrice.  # noqa: E501
        :rtype: datetime
        """
        return self.__date

    @_date.setter
    def _date(self, _date):
        """Sets the _date of this SecurityPrice.

        Security date  # noqa: E501

        :param _date: The _date of this SecurityPrice.  # noqa: E501
        :type: datetime
        """
        if self._configuration.client_side_validation and _date is None:
            raise ValueError("Invalid value for `_date`, must not be `None`")  # noqa: E501

        self.__date = _date

    @property
    def high(self):
        """Gets the high of this SecurityPrice.  # noqa: E501

        high  # noqa: E501

        :return: The high of this SecurityPrice.  # noqa: E501
        :rtype: float
        """
        return self._high

    @high.setter
    def high(self, high):
        """Sets the high of this SecurityPrice.

        high  # noqa: E501

        :param high: The high of this SecurityPrice.  # noqa: E501
        :type: float
        """

        self._high = high

    @property
    def id(self):
        """Gets the id of this SecurityPrice.  # noqa: E501


        :return: The id of this SecurityPrice.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this SecurityPrice.


        :param id: The id of this SecurityPrice.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def low(self):
        """Gets the low of this SecurityPrice.  # noqa: E501

        low  # noqa: E501

        :return: The low of this SecurityPrice.  # noqa: E501
        :rtype: float
        """
        return self._low

    @low.setter
    def low(self, low):
        """Sets the low of this SecurityPrice.

        low  # noqa: E501

        :param low: The low of this SecurityPrice.  # noqa: E501
        :type: float
        """

        self._low = low

    @property
    def open(self):
        """Gets the open of this SecurityPrice.  # noqa: E501

        open  # noqa: E501

        :return: The open of this SecurityPrice.  # noqa: E501
        :rtype: float
        """
        return self._open

    @open.setter
    def open(self, open):
        """Sets the open of this SecurityPrice.

        open  # noqa: E501

        :param open: The open of this SecurityPrice.  # noqa: E501
        :type: float
        """

        self._open = open

    @property
    def price(self):
        """Gets the price of this SecurityPrice.  # noqa: E501

        Security price  # noqa: E501

        :return: The price of this SecurityPrice.  # noqa: E501
        :rtype: float
        """
        return self._price

    @price.setter
    def price(self, price):
        """Sets the price of this SecurityPrice.

        Security price  # noqa: E501

        :param price: The price of this SecurityPrice.  # noqa: E501
        :type: float
        """
        if self._configuration.client_side_validation and price is None:
            raise ValueError("Invalid value for `price`, must not be `None`")  # noqa: E501

        self._price = price

    @property
    def secondary_id(self):
        """Gets the secondary_id of this SecurityPrice.  # noqa: E501


        :return: The secondary_id of this SecurityPrice.  # noqa: E501
        :rtype: str
        """
        return self._secondary_id

    @secondary_id.setter
    def secondary_id(self, secondary_id):
        """Sets the secondary_id of this SecurityPrice.


        :param secondary_id: The secondary_id of this SecurityPrice.  # noqa: E501
        :type: str
        """

        self._secondary_id = secondary_id

    @property
    def security_id(self):
        """Gets the security_id of this SecurityPrice.  # noqa: E501

        Security id  # noqa: E501

        :return: The security_id of this SecurityPrice.  # noqa: E501
        :rtype: str
        """
        return self._security_id

    @security_id.setter
    def security_id(self, security_id):
        """Sets the security_id of this SecurityPrice.

        Security id  # noqa: E501

        :param security_id: The security_id of this SecurityPrice.  # noqa: E501
        :type: str
        """
        if self._configuration.client_side_validation and security_id is None:
            raise ValueError("Invalid value for `security_id`, must not be `None`")  # noqa: E501

        self._security_id = security_id

    @property
    def update_date(self):
        """Gets the update_date of this SecurityPrice.  # noqa: E501


        :return: The update_date of this SecurityPrice.  # noqa: E501
        :rtype: datetime
        """
        return self._update_date

    @update_date.setter
    def update_date(self, update_date):
        """Sets the update_date of this SecurityPrice.


        :param update_date: The update_date of this SecurityPrice.  # noqa: E501
        :type: datetime
        """

        self._update_date = update_date

    @property
    def volume(self):
        """Gets the volume of this SecurityPrice.  # noqa: E501

        volume  # noqa: E501

        :return: The volume of this SecurityPrice.  # noqa: E501
        :rtype: float
        """
        return self._volume

    @volume.setter
    def volume(self, volume):
        """Sets the volume of this SecurityPrice.

        volume  # noqa: E501

        :param volume: The volume of this SecurityPrice.  # noqa: E501
        :type: float
        """

        self._volume = volume

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
        if issubclass(SecurityPrice, dict):
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
        if not isinstance(other, SecurityPrice):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, SecurityPrice):
            return True

        return self.to_dict() != other.to_dict()
