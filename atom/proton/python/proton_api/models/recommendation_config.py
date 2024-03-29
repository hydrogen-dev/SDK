# coding: utf-8

"""
    Hydrogen Proton API

    Financial engineering module of Hydrogen Atom  # noqa: E501

    OpenAPI spec version: 1.9.2
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six

from proton_api.configuration import Configuration


class RecommendationConfig(object):
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
        'horizon_max': 'int',
        'dep_min': 'float',
        'inv_max': 'float',
        'inv_min': 'float',
        'recommended_inflation': 'float',
        'horizon_min': 'int',
        'recommend': 'bool',
        'dep_max': 'float'
    }

    attribute_map = {
        'horizon_max': 'horizon_max',
        'dep_min': 'dep_min',
        'inv_max': 'inv_max',
        'inv_min': 'inv_min',
        'recommended_inflation': 'recommended_inflation',
        'horizon_min': 'horizon_min',
        'recommend': 'recommend',
        'dep_max': 'dep_max'
    }

    def __init__(self, horizon_max=64, dep_min=None, inv_max=None, inv_min=None, recommended_inflation=0.0, horizon_min=1, recommend=True, dep_max=None, _configuration=None):  # noqa: E501
        """RecommendationConfig - a model defined in Swagger"""  # noqa: E501
        if _configuration is None:
            _configuration = Configuration()
        self._configuration = _configuration

        self._horizon_max = None
        self._dep_min = None
        self._inv_max = None
        self._inv_min = None
        self._recommended_inflation = None
        self._horizon_min = None
        self._recommend = None
        self._dep_max = None
        self.discriminator = None

        if horizon_max is not None:
            self.horizon_max = horizon_max
        if dep_min is not None:
            self.dep_min = dep_min
        if inv_max is not None:
            self.inv_max = inv_max
        if inv_min is not None:
            self.inv_min = inv_min
        if recommended_inflation is not None:
            self.recommended_inflation = recommended_inflation
        if horizon_min is not None:
            self.horizon_min = horizon_min
        if recommend is not None:
            self.recommend = recommend
        if dep_max is not None:
            self.dep_max = dep_max

    @property
    def horizon_max(self):
        """Gets the horizon_max of this RecommendationConfig.  # noqa: E501


        :return: The horizon_max of this RecommendationConfig.  # noqa: E501
        :rtype: int
        """
        return self._horizon_max

    @horizon_max.setter
    def horizon_max(self, horizon_max):
        """Sets the horizon_max of this RecommendationConfig.


        :param horizon_max: The horizon_max of this RecommendationConfig.  # noqa: E501
        :type: int
        """
        if (self._configuration.client_side_validation and
                horizon_max is not None and horizon_max < 0):  # noqa: E501
            raise ValueError("Invalid value for `horizon_max`, must be a value greater than or equal to `0`")  # noqa: E501

        self._horizon_max = horizon_max

    @property
    def dep_min(self):
        """Gets the dep_min of this RecommendationConfig.  # noqa: E501


        :return: The dep_min of this RecommendationConfig.  # noqa: E501
        :rtype: float
        """
        return self._dep_min

    @dep_min.setter
    def dep_min(self, dep_min):
        """Sets the dep_min of this RecommendationConfig.


        :param dep_min: The dep_min of this RecommendationConfig.  # noqa: E501
        :type: float
        """
        if (self._configuration.client_side_validation and
                dep_min is not None and dep_min < 0):  # noqa: E501
            raise ValueError("Invalid value for `dep_min`, must be a value greater than or equal to `0`")  # noqa: E501

        self._dep_min = dep_min

    @property
    def inv_max(self):
        """Gets the inv_max of this RecommendationConfig.  # noqa: E501


        :return: The inv_max of this RecommendationConfig.  # noqa: E501
        :rtype: float
        """
        return self._inv_max

    @inv_max.setter
    def inv_max(self, inv_max):
        """Sets the inv_max of this RecommendationConfig.


        :param inv_max: The inv_max of this RecommendationConfig.  # noqa: E501
        :type: float
        """
        if (self._configuration.client_side_validation and
                inv_max is not None and inv_max < 0):  # noqa: E501
            raise ValueError("Invalid value for `inv_max`, must be a value greater than or equal to `0`")  # noqa: E501

        self._inv_max = inv_max

    @property
    def inv_min(self):
        """Gets the inv_min of this RecommendationConfig.  # noqa: E501


        :return: The inv_min of this RecommendationConfig.  # noqa: E501
        :rtype: float
        """
        return self._inv_min

    @inv_min.setter
    def inv_min(self, inv_min):
        """Sets the inv_min of this RecommendationConfig.


        :param inv_min: The inv_min of this RecommendationConfig.  # noqa: E501
        :type: float
        """
        if (self._configuration.client_side_validation and
                inv_min is not None and inv_min < 0):  # noqa: E501
            raise ValueError("Invalid value for `inv_min`, must be a value greater than or equal to `0`")  # noqa: E501

        self._inv_min = inv_min

    @property
    def recommended_inflation(self):
        """Gets the recommended_inflation of this RecommendationConfig.  # noqa: E501


        :return: The recommended_inflation of this RecommendationConfig.  # noqa: E501
        :rtype: float
        """
        return self._recommended_inflation

    @recommended_inflation.setter
    def recommended_inflation(self, recommended_inflation):
        """Sets the recommended_inflation of this RecommendationConfig.


        :param recommended_inflation: The recommended_inflation of this RecommendationConfig.  # noqa: E501
        :type: float
        """
        if (self._configuration.client_side_validation and
                recommended_inflation is not None and recommended_inflation < -1):  # noqa: E501
            raise ValueError("Invalid value for `recommended_inflation`, must be a value greater than or equal to `-1`")  # noqa: E501

        self._recommended_inflation = recommended_inflation

    @property
    def horizon_min(self):
        """Gets the horizon_min of this RecommendationConfig.  # noqa: E501


        :return: The horizon_min of this RecommendationConfig.  # noqa: E501
        :rtype: int
        """
        return self._horizon_min

    @horizon_min.setter
    def horizon_min(self, horizon_min):
        """Sets the horizon_min of this RecommendationConfig.


        :param horizon_min: The horizon_min of this RecommendationConfig.  # noqa: E501
        :type: int
        """
        if (self._configuration.client_side_validation and
                horizon_min is not None and horizon_min < 0):  # noqa: E501
            raise ValueError("Invalid value for `horizon_min`, must be a value greater than or equal to `0`")  # noqa: E501

        self._horizon_min = horizon_min

    @property
    def recommend(self):
        """Gets the recommend of this RecommendationConfig.  # noqa: E501


        :return: The recommend of this RecommendationConfig.  # noqa: E501
        :rtype: bool
        """
        return self._recommend

    @recommend.setter
    def recommend(self, recommend):
        """Sets the recommend of this RecommendationConfig.


        :param recommend: The recommend of this RecommendationConfig.  # noqa: E501
        :type: bool
        """

        self._recommend = recommend

    @property
    def dep_max(self):
        """Gets the dep_max of this RecommendationConfig.  # noqa: E501


        :return: The dep_max of this RecommendationConfig.  # noqa: E501
        :rtype: float
        """
        return self._dep_max

    @dep_max.setter
    def dep_max(self, dep_max):
        """Sets the dep_max of this RecommendationConfig.


        :param dep_max: The dep_max of this RecommendationConfig.  # noqa: E501
        :type: float
        """
        if (self._configuration.client_side_validation and
                dep_max is not None and dep_max < 0):  # noqa: E501
            raise ValueError("Invalid value for `dep_max`, must be a value greater than or equal to `0`")  # noqa: E501

        self._dep_max = dep_max

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
        if issubclass(RecommendationConfig, dict):
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
        if not isinstance(other, RecommendationConfig):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, RecommendationConfig):
            return True

        return self.to_dict() != other.to_dict()
