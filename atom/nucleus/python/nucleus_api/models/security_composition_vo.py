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


class SecurityCompositionVO(object):
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
        'end_date': 'date',
        'security_asset_class': 'str',
        'security_countries': 'list[SecurityCountryVO]',
        'security_create_date': 'datetime',
        'security_id': 'str',
        'security_industry': 'str',
        'security_name': 'str',
        'security_secondary_id': 'str',
        'security_sector': 'str',
        'security_security_class': 'str',
        'security_ticker': 'str',
        'security_update_date': 'datetime',
        'security_weight': 'float',
        'start_date': 'date'
    }

    attribute_map = {
        'end_date': 'end_date',
        'security_asset_class': 'security_asset_class',
        'security_countries': 'security_countries',
        'security_create_date': 'security_create_date',
        'security_id': 'security_id',
        'security_industry': 'security_industry',
        'security_name': 'security_name',
        'security_secondary_id': 'security_secondary_id',
        'security_sector': 'security_sector',
        'security_security_class': 'security_security_class',
        'security_ticker': 'security_ticker',
        'security_update_date': 'security_update_date',
        'security_weight': 'security_weight',
        'start_date': 'start_date'
    }

    def __init__(self, end_date=None, security_asset_class=None, security_countries=None, security_create_date=None, security_id=None, security_industry=None, security_name=None, security_secondary_id=None, security_sector=None, security_security_class=None, security_ticker=None, security_update_date=None, security_weight=None, start_date=None, _configuration=None):  # noqa: E501
        """SecurityCompositionVO - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._end_date = None
        self._security_asset_class = None
        self._security_countries = None
        self._security_create_date = None
        self._security_id = None
        self._security_industry = None
        self._security_name = None
        self._security_secondary_id = None
        self._security_sector = None
        self._security_security_class = None
        self._security_ticker = None
        self._security_update_date = None
        self._security_weight = None
        self._start_date = None
        self.discriminator = None

        if end_date is not None:
            self.end_date = end_date
        if security_asset_class is not None:
            self.security_asset_class = security_asset_class
        if security_countries is not None:
            self.security_countries = security_countries
        if security_create_date is not None:
            self.security_create_date = security_create_date
        if security_id is not None:
            self.security_id = security_id
        if security_industry is not None:
            self.security_industry = security_industry
        if security_name is not None:
            self.security_name = security_name
        if security_secondary_id is not None:
            self.security_secondary_id = security_secondary_id
        if security_sector is not None:
            self.security_sector = security_sector
        if security_security_class is not None:
            self.security_security_class = security_security_class
        if security_ticker is not None:
            self.security_ticker = security_ticker
        if security_update_date is not None:
            self.security_update_date = security_update_date
        if security_weight is not None:
            self.security_weight = security_weight
        if start_date is not None:
            self.start_date = start_date

    @property
    def end_date(self):
        """Gets the end_date of this SecurityCompositionVO.  # noqa: E501


        :return: The end_date of this SecurityCompositionVO.  # noqa: E501
        :rtype: date
        """
        return self._end_date

    @end_date.setter
    def end_date(self, end_date):
        """Sets the end_date of this SecurityCompositionVO.


        :param end_date: The end_date of this SecurityCompositionVO.  # noqa: E501
        :type: date
        """

        self._end_date = end_date

    @property
    def security_asset_class(self):
        """Gets the security_asset_class of this SecurityCompositionVO.  # noqa: E501


        :return: The security_asset_class of this SecurityCompositionVO.  # noqa: E501
        :rtype: str
        """
        return self._security_asset_class

    @security_asset_class.setter
    def security_asset_class(self, security_asset_class):
        """Sets the security_asset_class of this SecurityCompositionVO.


        :param security_asset_class: The security_asset_class of this SecurityCompositionVO.  # noqa: E501
        :type: str
        """

        self._security_asset_class = security_asset_class

    @property
    def security_countries(self):
        """Gets the security_countries of this SecurityCompositionVO.  # noqa: E501


        :return: The security_countries of this SecurityCompositionVO.  # noqa: E501
        :rtype: list[SecurityCountryVO]
        """
        return self._security_countries

    @security_countries.setter
    def security_countries(self, security_countries):
        """Sets the security_countries of this SecurityCompositionVO.


        :param security_countries: The security_countries of this SecurityCompositionVO.  # noqa: E501
        :type: list[SecurityCountryVO]
        """

        self._security_countries = security_countries

    @property
    def security_create_date(self):
        """Gets the security_create_date of this SecurityCompositionVO.  # noqa: E501


        :return: The security_create_date of this SecurityCompositionVO.  # noqa: E501
        :rtype: datetime
        """
        return self._security_create_date

    @security_create_date.setter
    def security_create_date(self, security_create_date):
        """Sets the security_create_date of this SecurityCompositionVO.


        :param security_create_date: The security_create_date of this SecurityCompositionVO.  # noqa: E501
        :type: datetime
        """

        self._security_create_date = security_create_date

    @property
    def security_id(self):
        """Gets the security_id of this SecurityCompositionVO.  # noqa: E501


        :return: The security_id of this SecurityCompositionVO.  # noqa: E501
        :rtype: str
        """
        return self._security_id

    @security_id.setter
    def security_id(self, security_id):
        """Sets the security_id of this SecurityCompositionVO.


        :param security_id: The security_id of this SecurityCompositionVO.  # noqa: E501
        :type: str
        """

        self._security_id = security_id

    @property
    def security_industry(self):
        """Gets the security_industry of this SecurityCompositionVO.  # noqa: E501


        :return: The security_industry of this SecurityCompositionVO.  # noqa: E501
        :rtype: str
        """
        return self._security_industry

    @security_industry.setter
    def security_industry(self, security_industry):
        """Sets the security_industry of this SecurityCompositionVO.


        :param security_industry: The security_industry of this SecurityCompositionVO.  # noqa: E501
        :type: str
        """

        self._security_industry = security_industry

    @property
    def security_name(self):
        """Gets the security_name of this SecurityCompositionVO.  # noqa: E501


        :return: The security_name of this SecurityCompositionVO.  # noqa: E501
        :rtype: str
        """
        return self._security_name

    @security_name.setter
    def security_name(self, security_name):
        """Sets the security_name of this SecurityCompositionVO.


        :param security_name: The security_name of this SecurityCompositionVO.  # noqa: E501
        :type: str
        """

        self._security_name = security_name

    @property
    def security_secondary_id(self):
        """Gets the security_secondary_id of this SecurityCompositionVO.  # noqa: E501


        :return: The security_secondary_id of this SecurityCompositionVO.  # noqa: E501
        :rtype: str
        """
        return self._security_secondary_id

    @security_secondary_id.setter
    def security_secondary_id(self, security_secondary_id):
        """Sets the security_secondary_id of this SecurityCompositionVO.


        :param security_secondary_id: The security_secondary_id of this SecurityCompositionVO.  # noqa: E501
        :type: str
        """

        self._security_secondary_id = security_secondary_id

    @property
    def security_sector(self):
        """Gets the security_sector of this SecurityCompositionVO.  # noqa: E501


        :return: The security_sector of this SecurityCompositionVO.  # noqa: E501
        :rtype: str
        """
        return self._security_sector

    @security_sector.setter
    def security_sector(self, security_sector):
        """Sets the security_sector of this SecurityCompositionVO.


        :param security_sector: The security_sector of this SecurityCompositionVO.  # noqa: E501
        :type: str
        """

        self._security_sector = security_sector

    @property
    def security_security_class(self):
        """Gets the security_security_class of this SecurityCompositionVO.  # noqa: E501


        :return: The security_security_class of this SecurityCompositionVO.  # noqa: E501
        :rtype: str
        """
        return self._security_security_class

    @security_security_class.setter
    def security_security_class(self, security_security_class):
        """Sets the security_security_class of this SecurityCompositionVO.


        :param security_security_class: The security_security_class of this SecurityCompositionVO.  # noqa: E501
        :type: str
        """

        self._security_security_class = security_security_class

    @property
    def security_ticker(self):
        """Gets the security_ticker of this SecurityCompositionVO.  # noqa: E501


        :return: The security_ticker of this SecurityCompositionVO.  # noqa: E501
        :rtype: str
        """
        return self._security_ticker

    @security_ticker.setter
    def security_ticker(self, security_ticker):
        """Sets the security_ticker of this SecurityCompositionVO.


        :param security_ticker: The security_ticker of this SecurityCompositionVO.  # noqa: E501
        :type: str
        """

        self._security_ticker = security_ticker

    @property
    def security_update_date(self):
        """Gets the security_update_date of this SecurityCompositionVO.  # noqa: E501


        :return: The security_update_date of this SecurityCompositionVO.  # noqa: E501
        :rtype: datetime
        """
        return self._security_update_date

    @security_update_date.setter
    def security_update_date(self, security_update_date):
        """Sets the security_update_date of this SecurityCompositionVO.


        :param security_update_date: The security_update_date of this SecurityCompositionVO.  # noqa: E501
        :type: datetime
        """

        self._security_update_date = security_update_date

    @property
    def security_weight(self):
        """Gets the security_weight of this SecurityCompositionVO.  # noqa: E501


        :return: The security_weight of this SecurityCompositionVO.  # noqa: E501
        :rtype: float
        """
        return self._security_weight

    @security_weight.setter
    def security_weight(self, security_weight):
        """Sets the security_weight of this SecurityCompositionVO.


        :param security_weight: The security_weight of this SecurityCompositionVO.  # noqa: E501
        :type: float
        """

        self._security_weight = security_weight

    @property
    def start_date(self):
        """Gets the start_date of this SecurityCompositionVO.  # noqa: E501


        :return: The start_date of this SecurityCompositionVO.  # noqa: E501
        :rtype: date
        """
        return self._start_date

    @start_date.setter
    def start_date(self, start_date):
        """Sets the start_date of this SecurityCompositionVO.


        :param start_date: The start_date of this SecurityCompositionVO.  # noqa: E501
        :type: date
        """

        self._start_date = start_date

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
        if issubclass(SecurityCompositionVO, dict):
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
        if not isinstance(other, SecurityCompositionVO):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, SecurityCompositionVO):
            return True

        return self.to_dict() != other.to_dict()
