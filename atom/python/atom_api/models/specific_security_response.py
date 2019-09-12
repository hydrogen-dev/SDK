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

from atom_api.models.create_security_response import CreateSecurityResponse  # noqa: F401,E501
from atom_api.models.security_payload_security_composition import SecurityPayloadSecurityComposition  # noqa: F401,E501
from atom_api.models.security_payload_security_country import SecurityPayloadSecurityCountry  # noqa: F401,E501


class SpecificSecurityResponse(object):
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
        'id': 'str',
        'create_date': 'str',
        'name': 'str',
        'ticker': 'str',
        'asset_class': 'str',
        'sector': 'str',
        'industry': 'str',
        'security_class': 'str',
        'exchange': 'str',
        'is_active': 'bool',
        'security_composition': 'list[SecurityPayloadSecurityComposition]',
        'security_country': 'list[SecurityPayloadSecurityCountry]',
        'update_date': 'str'
    }

    attribute_map = {
        'id': 'id',
        'create_date': 'create_date',
        'name': 'name',
        'ticker': 'ticker',
        'asset_class': 'asset_class',
        'sector': 'sector',
        'industry': 'industry',
        'security_class': 'security_class',
        'exchange': 'exchange',
        'is_active': 'is_active',
        'security_composition': 'security_composition',
        'security_country': 'security_country',
        'update_date': 'update_date'
    }

    def __init__(self, id=None, create_date=None, name=None, ticker=None, asset_class=None, sector=None, industry=None, security_class=None, exchange=None, is_active=True, security_composition=None, security_country=None, update_date=None):  # noqa: E501
        """SpecificSecurityResponse - a model defined in Swagger"""  # noqa: E501

        self._id = None
        self._create_date = None
        self._name = None
        self._ticker = None
        self._asset_class = None
        self._sector = None
        self._industry = None
        self._security_class = None
        self._exchange = None
        self._is_active = None
        self._security_composition = None
        self._security_country = None
        self._update_date = None
        self.discriminator = None

        if id is not None:
            self.id = id
        if create_date is not None:
            self.create_date = create_date
        self.name = name
        self.ticker = ticker
        if asset_class is not None:
            self.asset_class = asset_class
        if sector is not None:
            self.sector = sector
        if industry is not None:
            self.industry = industry
        if security_class is not None:
            self.security_class = security_class
        if exchange is not None:
            self.exchange = exchange
        if is_active is not None:
            self.is_active = is_active
        if security_composition is not None:
            self.security_composition = security_composition
        if security_country is not None:
            self.security_country = security_country
        if update_date is not None:
            self.update_date = update_date

    @property
    def id(self):
        """Gets the id of this SpecificSecurityResponse.  # noqa: E501

        ID of the security  # noqa: E501

        :return: The id of this SpecificSecurityResponse.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this SpecificSecurityResponse.

        ID of the security  # noqa: E501

        :param id: The id of this SpecificSecurityResponse.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def create_date(self):
        """Gets the create_date of this SpecificSecurityResponse.  # noqa: E501

        Datetime the security was created  # noqa: E501

        :return: The create_date of this SpecificSecurityResponse.  # noqa: E501
        :rtype: str
        """
        return self._create_date

    @create_date.setter
    def create_date(self, create_date):
        """Sets the create_date of this SpecificSecurityResponse.

        Datetime the security was created  # noqa: E501

        :param create_date: The create_date of this SpecificSecurityResponse.  # noqa: E501
        :type: str
        """

        self._create_date = create_date

    @property
    def name(self):
        """Gets the name of this SpecificSecurityResponse.  # noqa: E501

        Name for the security  # noqa: E501

        :return: The name of this SpecificSecurityResponse.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this SpecificSecurityResponse.

        Name for the security  # noqa: E501

        :param name: The name of this SpecificSecurityResponse.  # noqa: E501
        :type: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501

        self._name = name

    @property
    def ticker(self):
        """Gets the ticker of this SpecificSecurityResponse.  # noqa: E501

        Security’s ticker on the exchange where it is traded  # noqa: E501

        :return: The ticker of this SpecificSecurityResponse.  # noqa: E501
        :rtype: str
        """
        return self._ticker

    @ticker.setter
    def ticker(self, ticker):
        """Sets the ticker of this SpecificSecurityResponse.

        Security’s ticker on the exchange where it is traded  # noqa: E501

        :param ticker: The ticker of this SpecificSecurityResponse.  # noqa: E501
        :type: str
        """
        if ticker is None:
            raise ValueError("Invalid value for `ticker`, must not be `None`")  # noqa: E501

        self._ticker = ticker

    @property
    def asset_class(self):
        """Gets the asset_class of this SpecificSecurityResponse.  # noqa: E501

        The asset class for the security such as “equity”, “fixed-income”, “cash”, etc.  # noqa: E501

        :return: The asset_class of this SpecificSecurityResponse.  # noqa: E501
        :rtype: str
        """
        return self._asset_class

    @asset_class.setter
    def asset_class(self, asset_class):
        """Sets the asset_class of this SpecificSecurityResponse.

        The asset class for the security such as “equity”, “fixed-income”, “cash”, etc.  # noqa: E501

        :param asset_class: The asset_class of this SpecificSecurityResponse.  # noqa: E501
        :type: str
        """

        self._asset_class = asset_class

    @property
    def sector(self):
        """Gets the sector of this SpecificSecurityResponse.  # noqa: E501

        Sector for the security such as “Technology” or “Pharmaceuticals”  # noqa: E501

        :return: The sector of this SpecificSecurityResponse.  # noqa: E501
        :rtype: str
        """
        return self._sector

    @sector.setter
    def sector(self, sector):
        """Sets the sector of this SpecificSecurityResponse.

        Sector for the security such as “Technology” or “Pharmaceuticals”  # noqa: E501

        :param sector: The sector of this SpecificSecurityResponse.  # noqa: E501
        :type: str
        """

        self._sector = sector

    @property
    def industry(self):
        """Gets the industry of this SpecificSecurityResponse.  # noqa: E501

        The industry of the security such as “Consumer Tech” or “Enterprise Systems”  # noqa: E501

        :return: The industry of this SpecificSecurityResponse.  # noqa: E501
        :rtype: str
        """
        return self._industry

    @industry.setter
    def industry(self, industry):
        """Sets the industry of this SpecificSecurityResponse.

        The industry of the security such as “Consumer Tech” or “Enterprise Systems”  # noqa: E501

        :param industry: The industry of this SpecificSecurityResponse.  # noqa: E501
        :type: str
        """

        self._industry = industry

    @property
    def security_class(self):
        """Gets the security_class of this SpecificSecurityResponse.  # noqa: E501

        The security class of the security such as “stock”, “mutual fund”, “ETF” (exchange-traded fund), etc.  # noqa: E501

        :return: The security_class of this SpecificSecurityResponse.  # noqa: E501
        :rtype: str
        """
        return self._security_class

    @security_class.setter
    def security_class(self, security_class):
        """Sets the security_class of this SpecificSecurityResponse.

        The security class of the security such as “stock”, “mutual fund”, “ETF” (exchange-traded fund), etc.  # noqa: E501

        :param security_class: The security_class of this SpecificSecurityResponse.  # noqa: E501
        :type: str
        """

        self._security_class = security_class

    @property
    def exchange(self):
        """Gets the exchange of this SpecificSecurityResponse.  # noqa: E501

        The exchange on which the security is traded  # noqa: E501

        :return: The exchange of this SpecificSecurityResponse.  # noqa: E501
        :rtype: str
        """
        return self._exchange

    @exchange.setter
    def exchange(self, exchange):
        """Sets the exchange of this SpecificSecurityResponse.

        The exchange on which the security is traded  # noqa: E501

        :param exchange: The exchange of this SpecificSecurityResponse.  # noqa: E501
        :type: str
        """

        self._exchange = exchange

    @property
    def is_active(self):
        """Gets the is_active of this SpecificSecurityResponse.  # noqa: E501

        Indicates if the security is active. Defaults to true which indicates that the it is active  # noqa: E501

        :return: The is_active of this SpecificSecurityResponse.  # noqa: E501
        :rtype: bool
        """
        return self._is_active

    @is_active.setter
    def is_active(self, is_active):
        """Sets the is_active of this SpecificSecurityResponse.

        Indicates if the security is active. Defaults to true which indicates that the it is active  # noqa: E501

        :param is_active: The is_active of this SpecificSecurityResponse.  # noqa: E501
        :type: bool
        """

        self._is_active = is_active

    @property
    def security_composition(self):
        """Gets the security_composition of this SpecificSecurityResponse.  # noqa: E501

        Details on the components of a security, their relative weight within the security, and their start and end dates  # noqa: E501

        :return: The security_composition of this SpecificSecurityResponse.  # noqa: E501
        :rtype: list[SecurityPayloadSecurityComposition]
        """
        return self._security_composition

    @security_composition.setter
    def security_composition(self, security_composition):
        """Sets the security_composition of this SpecificSecurityResponse.

        Details on the components of a security, their relative weight within the security, and their start and end dates  # noqa: E501

        :param security_composition: The security_composition of this SpecificSecurityResponse.  # noqa: E501
        :type: list[SecurityPayloadSecurityComposition]
        """

        self._security_composition = security_composition

    @property
    def security_country(self):
        """Gets the security_country of this SpecificSecurityResponse.  # noqa: E501

        Each country where the security is traded and its relative weight within the security  # noqa: E501

        :return: The security_country of this SpecificSecurityResponse.  # noqa: E501
        :rtype: list[SecurityPayloadSecurityCountry]
        """
        return self._security_country

    @security_country.setter
    def security_country(self, security_country):
        """Sets the security_country of this SpecificSecurityResponse.

        Each country where the security is traded and its relative weight within the security  # noqa: E501

        :param security_country: The security_country of this SpecificSecurityResponse.  # noqa: E501
        :type: list[SecurityPayloadSecurityCountry]
        """

        self._security_country = security_country

    @property
    def update_date(self):
        """Gets the update_date of this SpecificSecurityResponse.  # noqa: E501

        Datetime the security was last updated  # noqa: E501

        :return: The update_date of this SpecificSecurityResponse.  # noqa: E501
        :rtype: str
        """
        return self._update_date

    @update_date.setter
    def update_date(self, update_date):
        """Sets the update_date of this SpecificSecurityResponse.

        Datetime the security was last updated  # noqa: E501

        :param update_date: The update_date of this SpecificSecurityResponse.  # noqa: E501
        :type: str
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
        if issubclass(SpecificSecurityResponse, dict):
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
        if not isinstance(other, SpecificSecurityResponse):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
