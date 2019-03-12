class Coordinate(object):
    """ A coordinate made up of an x and y value """
    def __init__(self, x, y):
        """ Khởi tạo tọa độ """
        self.x = x
        self.y = y
    def __str__(self):
        """ Trả về  phiên bản string của tọa độ  """
        #print(self.x, self.y)
        return "<" + str(self.x) + "," + str(self.y) + ">"
    def distance(self, other):
        """ Trả về khoảng cách Euclidean của 2 điểm  """
        x_diff_sq = (self.x-other.x)**2
        y_diff_sq = (self.y-other.y)**2
        return (x_diff_sq + y_diff_sq)**0.5


c = Coordinate(3,4)
origin = Coordinate(0,0)
print(c.x, origin.x)
print(c.distance(origin))
print(Coordinate.distance(c, origin))
print(origin.distance(c))
print(c)